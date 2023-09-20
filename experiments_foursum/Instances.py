from typing import List, Tuple
import csv
import Benchmarks


INSTANCES: List[Tuple[str,str]] = [
    ('quartic', '../4sum/app/build/libs/app.jar'),
    ('cubic', '../4sum/app/build/libs/app.jar'),
    ('hashmap', '../4sum/app/build/libs/app.jar')
]

if __name__ == '__main__':
    try:
        with open('./results/results.csv','w') as f:
            writer = csv.DictWriter(f, 
                fieldnames = ['algorithm','n','time'])
            writer.writeheader()
            for algorithm, jar in INSTANCES:
                results: List[Tuple[int,float]] = \
                    Benchmarks.benchmark(algorithm, jar)
                for (n,t) in results:
                    writer.writerow({ 
                        'algorithm' : algorithm,
                        'n' : n,
                        'time' : t
                    })
    except Exception as e:
        print(f"An error occurred: {e}")