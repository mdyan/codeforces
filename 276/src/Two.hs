get :: IO String
get = fmap (head . words) getLine

main = do
    word <- get
    putStrLn $ stringTask word
