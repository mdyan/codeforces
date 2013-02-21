import Data.Char

--118A
stringTask :: String -> String
stringTask str = addDots [x | x <- s, not $ x `elem` "aeiouy"]
    where s = map toLower str

addDots :: String -> String
addDots [] = []
addDots (x:xs) = '.' : x : addDots xs

get :: IO String
get = fmap (head . words) getLine

main = do
    word <- get
    putStrLn $ stringTask word
