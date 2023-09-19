#!/usr/bin/env python3

import subprocess
import InputGenerator

TIMEOUT = 30

# run the given jar package,
# provide the given arg as the command-line 
# argument,
# feed the given input string to the stdin of the 
# process,
# and return the stdout from the process as string
def run_java(jar: str, arg: str, input: str) -> str:
    p = subprocess.Popen(['java', '-jar', jar,arg], 
        stdin=subprocess.PIPE, 
        stdout=subprocess.PIPE)
    (output,_) = p.communicate(input.encode('utf-8'), 
        timeout=TIMEOUT)
    return output.decode('utf-8')

if __name__ == '__main__':
    for n, input_lists in InputGenerator.INPUT_DATA.items():
        for input_list in input_lists:
            input_str = f"{n}\n{' '.join(map(str, input_list))}"
            result = run_java('../4sum/app/build/libs/app.jar', 'quartic', input_str)
            print('Output: ' + result + 'Input size: ' + str(len(input_list)))
