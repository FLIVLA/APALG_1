from typing import List, Tuple
import subprocess
import Runtimes
import InputGenerator

def benchmark(algorithm: str, jar: str)-> \
    List[Tuple[int,float]]:
    results: List[Tuple[int,float]] = list()

    for n in InputGenerator.NS:
        try: 
            result_n: List[Tuple[int,float]] = list()
            for i in range(InputGenerator.M):
                input: List[int] = InputGenerator.INPUT_DATA[n][i]
                diff: float = Runtimes.measure(algorithm,jar,
                    input)
                result_n.append((n,diff))
            results += result_n
        except subprocess.TimeoutExpired:
            break
    return results