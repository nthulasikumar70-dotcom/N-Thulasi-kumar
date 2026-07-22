/**
 * @param {*} value
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(value, classFunction) {
    if (value === null || value === undefined) return false;
    if (typeof classFunction !== "function") return false;

    return Object(value) instanceof classFunction;
};
