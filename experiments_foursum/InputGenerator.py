from typing import List, Dict
import numpy as np # type: ignore

TIMEOUT = 30

# how many different values of n
I_MAX: int = 30

# the different values of n
NS: List[int] = [int(30 * 1.41**i) \
 for i in range(I_MAX)]

# how many repetitions for the same n
M: int = 5

# seed for the pseudorandom number generator
SEED: int = 314159

# the PRNG object
rng = np.random.default_rng(SEED)

# The generated input:
# The dictionary maps n to a list of lists
# each list contains M lists of n ints
INPUT_DATA: Dict[int,List[List[int]]] = {
    n : [rng.integers(1, 2**28, n) \
         for _ in range(M)] \
    for n in NS
}