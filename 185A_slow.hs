remainder :: Integer
remainder = 10^9 + 7

tri :: (Num n, Eq n) => n -> Integer
tri 0 = 0
tri 1 = 3
tri 2 = 10
tri n = ((6 * tri (n-1)) - (8 * tri (n-2)))

--plant :: Integer -> Integer
--plant n = mod (tri n)
    
--get :: IO Integer
--get = fmap (head . (map read) . words) getLine

--main = do
    --num <- get
    --putStrLn $ show $ plant num
