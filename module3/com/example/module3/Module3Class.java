package com.example.module3;
import com.example.module2.Module2Class;
public class Module3Class { public String greet() { return new Module2Class().greet() + " and Module3"; } }