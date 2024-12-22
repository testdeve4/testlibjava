package com.example.module2;
import com.example.module1.Module1Class;
public class Module2Class { public String greet() { return new Module1Class().greet() + " and Module2"; } }