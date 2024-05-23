# 🧪 ListaUtil Testing Framework
A Java-based testing framework for integer list operations, designed for automated unit testing using JUnit.

## Overview
`ListaUtil` is a utility class for managing a dynamic list of integers, providing methods for adding, removing, and analyzing list contents. `ListaUtilTest` includes a suite of JUnit tests that validate all functionalities of `ListaUtil` under various conditions.

## Key Components
- **`ListaUtil`**: Manages a list of integers with methods to add, remove, and perform calculations such as counting, summing, and finding the max and min values.
- **`ListaUtilTest`**: Implements JUnit tests to ensure `ListaUtil` functions as expected. Each method in `ListaUtil` is covered by multiple tests to validate its correctness across different scenarios.

## About repo
![GitHub last commit](https://img.shields.io/github/last-commit/lucasgianine/java-automated-tests)

### Features
- **Add/Remove Operations**: Safely add and remove integers, with special handling for `null` values.
- **Aggregate Information**: Count total, even, and odd integers.
- **Mathematical Calculations**: Sum integers and find the largest and smallest values in the list.
- **Duplication Check**: Determine whether the list contains any duplicate integers.
- **Comprehensive Testing**: Each operation is rigorously tested to ensure reliability and accuracy.

## Test Descriptions
- **`add()` Tests**: Validate that adding integers (both positive and negative) updates the list size appropriately and that adding `null` does not affect the list.
- **`remove()` Tests**: Ensure that removing an integer adjusts the list size correctly, and that removing `null` or non-existent values does not alter the list size.
- **`count()` Tests**: Check the count functionality for both empty and populated lists.
- **`countPares()` and `countImpares()` Tests**: Verify counting of even and odd numbers in various list states.
- **`somar()` Tests**: Assess the sum function with different sets of integers.
- **`getMaior()` and `getMenor()` Tests**: Test for correct identification of the largest and smallest integers.
- **`hasDuplicidade()` Tests**: Check for duplicate values in the list to ensure the function accurately identifies duplicates or the absence thereof.

## Usage
Integrate `ListaUtil` into any Java project where integer list management is needed. Use `ListaUtilTest` to validate functionality or as a reference for writing further tests with JUnit.
