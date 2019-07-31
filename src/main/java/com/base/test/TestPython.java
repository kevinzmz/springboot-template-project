package com.base.test;

import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/7/15 16:40
 **/
public class TestPython {
    public static void main(String[] args) {
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("D:\\repository-python\\python-test\\Car.py");

        PyFunction pyFunction = interpreter.get("wdd",PyFunction.class);

        int a = 5;
        int b = 10;

        PyObject pyObject = pyFunction.__call__(new PyInteger(a),new PyInteger(b));
        System.out.println("the answer is :" + pyObject);

        int c = 2;
        int d = 4;
        PyObject two = pyFunction.__call__(new PyInteger(c),new PyInteger(d));
        System.out.println("Second answer: " + two);
    }
}
