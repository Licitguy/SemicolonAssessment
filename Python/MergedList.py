list1 = [1, 3, 5, 7, 9]
list2 = [2, 4, 6, 8, 10]


def merge_lists(list1, list2):
    return sorted(list1 + list2)


merged_list = merge_lists(list1, list2)
print(merged_list)
