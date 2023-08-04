package com.example.sudoku.solver

enum class AlterAffectedRowOperation {
    SET_AFFECTED_ROW, UNSET_AFFECTED_ROW
}

enum class AlterAffectedColumnOperation {
    SET_AFFECTED_COLUMN, UNSET_AFFECTED_COLUMN
}

enum class AlterAffectedSquareOperation {
    SET_AFFECTED_SQUARE, UNSET_AFFECTED_SQUARE
}