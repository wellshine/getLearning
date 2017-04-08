package letmesleep.uicp.cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.Temperature;

import letmesleep.uicp.cn.dao.TempDao;

public class TempDaoImpl implements TempDao {
	private Connection conn;
	public TempDaoImpl(Connection con){
		this.conn=con;
	}
	public List<Temperature> getAllTempData() {
		// TODO Auto-generated method stub
		List<Temperature> all=new ArrayList<Temperature>();
		PreparedStatement pstmt=null;
		String sql="SELECT temperature,date FROM ResponseData";
		try {
			pstmt = this.conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); // ִ�в�ѯ����
			while (rs.next()) {
				Temperature temp=new Temperature();
				temp.setTemperature(rs.getInt(1));
				temp.setDate(rs.getString(2));


				all.add(temp); // ���е������򼯺��в���
			}
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally { // ��������׳������տ϶���Ҫ�������ݿ�Ĺرղ�����
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e1) {

				}
			}
		}
		return all;
	}
}
