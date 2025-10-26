package com.anondo.quizapppractice

object Mathematics {

    val question = mutableListOf<Quiz>(


        Quiz(
            "If a = 2 and b = 3, then (a + b)² = ?", listOf("10", "12", "25", "25"), 2
        ),
        Quiz("The roots of x² - 5x + 6 = 0 are:", listOf("2,3", "3,4", "1,6", "4,5"), 0),
        Quiz("If sinθ = 3/5, then cosθ = ?", listOf("4/5", "5/4", "3/4", "1/5"), 0),
        Quiz("Derivative of x² is:", listOf("2x", "x", "x²", "x³"), 0),
        Quiz("Integral of x dx is:", listOf("x²/2 + C", "2x + C", "1/x + C", "x³ + C"), 0),
        Quiz(
            "If A = {1,2,3} and B = {3,4,5}, then A ∩ B =",
            listOf("{1,2}", "{3}", "{4,5}", "{1,3,5}"),
            1
        ),
        Quiz("If tanθ = 1, θ equals:", listOf("30°", "45°", "60°", "90°"), 1),
        Quiz("The slope of y = 3x + 2 is:", listOf("2", "3", "1", "0"), 1),
        Quiz(
            "If log10(2) = 0.3010, then log10(200) =",
            listOf("2.3010", "3.3010", "0.3010", "1.3010"),
            3
        ),
        Quiz("If x³ = 27, then x =", listOf("2", "3", "9", "6"), 1),
        Quiz("If a = 3, b = 4, then √(a² + b²) =", listOf("5", "6", "7", "4"), 0),
        Quiz("If f(x) = x² + 3x, then f'(x) =", listOf("x²", "2x + 3", "2x - 3", "3x²"), 1),
        Quiz("If sin²θ + cos²θ = ?", listOf("0", "1", "2", "Undefined"), 1),
        Quiz(
            "If two lines are perpendicular, the product of their slopes is:",
            listOf("0", "1", "-1", "∞"),
            2
        ),
        Quiz("The value of sin45° =", listOf("1", "1/√2", "√3/2", "1/2"), 1),
        Quiz("The value of cos60° =", listOf("1/2", "√3/2", "0", "1"), 0),
        Quiz("If secθ = 2, then cosθ =", listOf("2", "1/2", "1", "0.5"), 1),
        Quiz("If x² = 16, then x =", listOf("4", "±4", "-4", "0"), 1),
        Quiz("If (x + 1)(x - 1) = 0, then x =", listOf("1 or -1", "1", "-1", "0"), 0),
        Quiz("If f(x) = 2x + 5, find f(3)", listOf("11", "10", "8", "15"), 0),
        Quiz(
            "The quadratic formula is:",
            listOf(
                "x = (-b ± √(b² - 4ac)) / 2a",
                "x = (-b ± √(b² + 4ac)) / 2a",
                "x = (b ± √(b² - 4ac)) / 2a",
                "x = (a ± b) / 2"
            ),
            0
        ),
        Quiz(
            "If the sum of roots = 5 and product = 6, the equation is:",
            listOf("x² - 5x + 6 = 0", "x² + 5x + 6 = 0", "x² - 6x + 5 = 0", "x² + 6x - 5 = 0"),
            0
        ),
        Quiz("If matrix A = [[1,2],[3,4]], det(A) =", listOf("10", "2", "-2", "1"), 2),
        Quiz("If tanA = 3/4, then sinA =", listOf("3/5", "4/5", "5/3", "1/5"), 0),
        Quiz("The area of a triangle = ?", listOf("½bh", "2bh", "bh", "b+h"), 0),
        Quiz("If x → 2, find limit of (x² - 4)/(x - 2)", listOf("2", "4", "6", "∞"), 1),
        Quiz("Derivative of sinx =", listOf("cosx", "-cosx", "-sinx", "tanx"), 0),
        Quiz("Derivative of cosx =", listOf("sinx", "-sinx", "-cosx", "tanx"), 1),
        Quiz(
            "If the equation of a line is 2x + 3y = 6, its slope is:",
            listOf("-2/3", "2/3", "3/2", "1/3"),
            0
        ),
        Quiz("If θ = 30°, then tanθ =", listOf("1/√3", "√3", "1", "1/2"), 0),
        Quiz("Value of sin0° =", listOf("1", "0", "-1", "∞"), 1),
        Quiz("If loga(b) × logb(c) = ?", listOf("logb(a)", "logc(a)", "loga(c)", "1"), 2),
        Quiz("If f(x) = x³, then f'(x) =", listOf("3x²", "x²", "x³", "2x"), 0),
        Quiz(
            "If vectors a = (2,3) and b = (1,4), then a + b =",
            listOf("(3,7)", "(2,7)", "(1,3)", "(3,6)"),
            0
        ),
        Quiz("If sinA = 0.6, find cosA", listOf("0.8", "0.5", "0.9", "0.7"), 0),
        Quiz("Area of a circle = ?", listOf("πr²", "2πr", "πr", "πd"), 0),
        Quiz("If y = x³ + 2x, then dy/dx =", listOf("3x² + 2", "2x + 3", "x²", "3x + 2"), 0),
        Quiz(
            "If a = 2i + 3j, b = i - 2j, then a + b =",
            listOf("3i + j", "i + j", "3i - j", "2i + j"),
            0
        ),
        Quiz(
            "If cos²θ = 1 - sin²θ, this is:",
            listOf("Pythagorean identity", "Sum rule", "Product rule", "Inverse rule"),
            0
        ),
        Quiz("If log10(100) = ?", listOf("1", "2", "10", "0"), 1),
        Quiz(
            "The function y = mx + c represents:",
            listOf("Straight line", "Circle", "Parabola", "Ellipse"),
            0
        ),
        Quiz("If |x| = 5, then x =", listOf("5 only", "-5 only", "±5", "0"), 2),
        Quiz("If sinA = 1, then A =", listOf("0°", "90°", "180°", "45°"), 1),
        Quiz(
            "If two lines are parallel, their slopes are:",
            listOf("Equal", "Reciprocal", "Opposite", "Zero"),
            0
        ),
        Quiz("If a = 2, find the value of 3a² + 2a + 1", listOf("12", "15", "17", "18"), 2),
        Quiz("If f(x) = x² + 4x + 4, its minimum value is:", listOf("0", "2", "4", "-4"), 0),
        Quiz("If angle A = 60°, then cosA =", listOf("1/2", "√3/2", "1", "0"), 0),
        Quiz("If determinant of [[a,b],[b,a]] = ?", listOf("a² - b²", "a² + b²", "ab", "a + b"), 0),
        Quiz(
            "If a² + b² = c², then the triangle is:",
            listOf("Acute", "Obtuse", "Right-angled", "Equilateral"),
            2
        )
    )
}