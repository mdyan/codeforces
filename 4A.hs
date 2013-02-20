-- Codeforces.com 4A

isDivisible :: Int -> [Char]
isDivisible n
    | d == True = "YES"
    | d == False = "NO"
    where d = (n `mod` 2 == 0) && (n /= 2)
    
main :: IO()
main = do
    s <- getLine
    let n = read s :: Int
    putStrLn $ isDivisible n
