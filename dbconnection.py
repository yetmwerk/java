import sqlite3
class dbboperation:
 def__init__(self,db)
 self.con=sqlite3,connect(db)
 sel.c=self.con.cursor()
 self.c.excute("""CREATE TABLE IF NOT EXISTS student(sid INTEGER PRIMARY KEY,
                    name TEXT NULL,
                    gender TEXT NOT NULL
                    )
                    """)
 self.con.commit()
def insert(self,name,gender,department):
 sql="""insert into student values(NULL,?,?,?)"""
 self.c.excute(sql,(name,gender,department))
 self.con.commit()
def fetech_record(self):
 data.c.fetchall()
 return data
def removerecord(self,sid):
 sql="""delete from student where sid=?"""
 self.c.excute(sql,(sid))
 self.con.commit()
def  updaterecord(self,name,gender,department,id):
 sql="""
 update student set name=?,gender=?,department=?,where sid=?
 """
 self.c.excute(sql,(name,gender,department,sid))
 self.con.commit()







       

       


