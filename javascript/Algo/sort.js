var array = [2, 4, 5, 10, 8, -2];
//console.log(array.sort());
// console.log(10 < 2);

function sort(array) {
    var worker = array.slice();

    for (var i = 0; i < worker.length; i++) {

        var hasSwapped = false;

        for (var j = 0; j < worker.length - i; j++) {

            if (worker[j] > worker[j + 1]) {
                swap(worker, j);
                hasSwapped = true;
            }
        }
        if (hasSwapped == false) {
            console.log('has not swapped for i=' + i);
            break;
        }
    }

    return worker;
}


function swap(array, i) {
    //Guards; defensing programming
    if (array.length < 2) {
        return array;
    }

    if (i >= array.length) {
        throw 'Bad array size';
    }

    buffer = array[i + 1];
    array[i + 1] = array[i]
    array[i] = buffer;
    return array;

}

console.log(swap([2, 3], 0).toString() == [3, 2].toString());
console.log(swap([2, 3, 4], 0).toString() == [3, 2, 4].toString());


// swap([2, 3, 4], 0) == [3, 2, 4]
// swap([2, 3, 4], 1) == [2, 4, 3]
// swap([], 0) == []
// swap([2], 1) != [2]


console.log(sort(array));