//!/bin/ruby
//
// Watson gives Sherlock an array a of length n. 
// Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. 
// If there are no elements to the left/right, then the sum is considered to be zero. 
// Input Format
// The first line contains T, the number of test cases. 
// For each test case, the first line contains n, the number of elements in the array a. 
// The second line for each test case contains n space-separated integers, denoting the array a.
// Output Format
// For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.
//
//def sum_all(a,b)
//    sum=0
//    for i in (0..a.length-1) do
//        b[i] = sum + a[i]
//        sum += a[i]
//    end
//    return sum
//end
//
//def solve(a,b)
//    # Complete this function
//    sum = sum_all(a,b)
//    #puts sum
//    #puts b[b.length-1]
//    for i in (0..a.length-1) do
//        if b[i] - a[i] == sum - b[i]
//            return "YES"
//        end
//    end
//    return "NO"
//end
//
//T = gets.strip.to_i
//for a0 in (0..T-1)
//    n = gets.strip.to_i
//    a = gets.strip
//    a = a.split(' ').map(&:to_i)
//    b = []
//    result = solve(a,b)
//    puts result;
//end
