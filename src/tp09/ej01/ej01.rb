my_array = [9, 5, 1, 2, 3, 4, 0, -1]
p my_array.size #8
p my_array.first  #9
p my_array.last #-1
p my_array[1] #5
p my_array[9] #nil
p my_array[2..4]  #1, 2, 3
p my_array[2...4] #1, 2
p my_array[2, 4]  #1, 2, 3, 4
p my_array[-3]  #4
p my_array.first(4) #9, 5, 1, 2
p my_array.drop(4)  #3, 4, 0, -1
p my_array.prepend(10, 11)  # 10, 11, 9, 5, ...
p my_array.append(20, 21) #10, 11, ..., 0, -1, 20, 21
p(my_array.map { |e| e * 3 }) #30, 33, 27, 15, 3, 6, 9, ...
p(my_array.map { |e| e * 3 }.reduce { |sum, e| sum + e }) #30 + 33 + 27 + 15 + 3 + 6
