/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.pojo.Choice;
import com.pojo.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuestionService {
    public static boolean addQuestion(Question q, List<Choice> choices) {
        Connection conn = Utils.getConn();
        String sql = "INSERT INTO question(id, content, category_id)"+"VALUES(?, ?, ?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, q.getId());
        stm.setString(2, q.getContent());
        stm.setInt(3, q.getCategory().getId());
        
        
       
    }
}
