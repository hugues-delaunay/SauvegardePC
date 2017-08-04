const inputs = [2, 5, 6, 3, 0, -12, 34];

function quicksort(array) {

    if (array.length == 0) {
        return [];
    }

    const smalls = [],
        bigs = [];
    const first = array[0];

    for (var i = 1; i < array.length; i++) {
        const current = array[i];

        if (current < first) {
            smalls.push(current);
        } else {
            bigs.push(current);
        }
    }

    return quicksort(smalls).concat(first).concat(quicksort(bigs));
}

console.log(quicksort(inputs));