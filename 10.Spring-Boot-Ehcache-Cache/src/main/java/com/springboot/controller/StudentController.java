package com.springboot.controller;

import com.springboot.bean.Student;
import com.springboot.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController 和 Controller区别：
 * * RestController返回Json字符串格式, 而Controller返回的字符串代表Html文件名，会自动到静态文件寻找对应html文件
 * User: cpy
 * Date: 2020/4/4
 * Time: 3:02 下午
 */
@RestController
class StudentController {

    // ===========================================================
    // Constants
    // ===========================================================
    @Autowired
    private StudentService studentService;

    /**
     * RequestMapping的params代表url中必须带有参数，如果有value值的话，那值也要符合
     */
    @RequestMapping(path = "/query", params = "sno")
    public String queryStudentBySno(String sno) {
        Student student = studentService.queryStudentBySno(sno);
        return student.toString();
    }

    /**
     * Model是类似一个可以添加key-value的hashMap结构，可以关联页面属性
     */
    @RequestMapping(path = "/query2")
    public String queryStudentBySno(String sno, Model model) {
        Student student = studentService.queryStudentBySno(sno);
        model.addAttribute("name", student.getName());
        return "model";
    }

    /**
     * 如果path中要带有参数的值，可通过{alisName}添加构成目标路径
     * produces代表输出的格式
     */
    @RequestMapping(path = "/student{id}", method = RequestMethod.POST, produces = "text/plain")
    public String queryStudentBySno2(@PathVariable("id") String sno) {
        Student student = studentService.queryStudentBySno(sno);
        return student.getSno() + ", name = " + student.getName();
    }

    @RequestMapping(path = "/update", params = "sno")
    public void updateStudentBySno(String sno, String name) {
        Student student = studentService.queryStudentBySno(sno);
        student.setName(name);
        studentService.update(student);
    }
    
    @RequestMapping(path = "/delete", params = "sno=#sno")
    public void deleteStudentBySno(String sno) {
        studentService.deleteStudentBySno(sno);
    }


    // ===========================================================
    // Fields
    // ===========================================================


    // ===========================================================
    // Override Methods
    // ===========================================================

    // ===========================================================
    // Define Methods
    // ===========================================================


    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================


    // ===========================================================
    // Getter & Setter
    // ===========================================================  

}
