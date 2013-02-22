--185A
import Data.Int (Int64)

r:: Int64
r = 10^9 + 7

plant :: Int64 -> Integer
-- plant :: (Integral n) => n -> Integer
plant 0 = 0
plant 1 = 1
plant 2 = 3
-- at this point 
plant n = toInteger(modularExponent 2 (n-1)) * toInteger((modularExponent 2 n)+1) `mod` toInteger r

modularExponent :: Int64 -> Int64 -> Int64
modularExponent _ 0 = 1
modularExponent b e
--    | e `mod` 2 == 0 = modularExponent b ( e `div` 2) `mod` r
    | otherwise = (b * (modularExponent b (e-1) )) `mod` r


get :: IO Int64
get = fmap (head . (map read) . words) getLine

main = do
    num <- get
    putStrLn $ show $ plant num


