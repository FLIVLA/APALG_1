from typing import List
import time
import InputGenerator
import Experiments

def measure(algorithm: str, jar: str, 
    input: List[int])->float:
    input_string: str = f'{len(input)}\n' + \
        ' '.join(map(str,input))
    start: float = time.time()
    result_string: str = Experiments.run_java(jar, algorithm, 
        input_string)
    end: float = time.time()
    assert result_string.strip() == 'null'
    return end - start

if __name__ == '__main__':
    print(measure('cubic', 
        '../threesum/app/build/libs/app.jar',
        InputGenerator.INPUT_DATA[30][0]))