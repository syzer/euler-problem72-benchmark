import Control.Monad
import Data.Array.IO
import Data.Array

collectMultiply :: Int -> IOUArray Int Int -> Int -> IO (IOUArray Int Int)
collectMultiply current array index = 
  do
    elem <- readArray array index
    writeArray array index (elem - (elem `quot` current))
    return array

-- given a number and an array, returns an array of the same size
-- with all the elements updated accordingly
sieve :: Int -> IOUArray Int Int -> Int -> IO (IOUArray Int Int)
sieve until array index =
  do
    current <- readArray array index
    if current /= index
      then return array
      else foldM (collectMultiply index) array [index, index+index .. until]
      
solve72 :: Int -> IO Int
solve72 until = do
  array <- (genArray until)
  solved <- foldM (sieve until) array [2 .. until] >>= getElems :: IO [Int]
  return $ sum solved

genArray :: Int -> IO (IOUArray Int Int)
genArray until = newListArray (2,until) [2 .. until]
