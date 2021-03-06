package mo.com.phonesafe.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 作者：MoMxMo on 2015/9/2 22:27
 * 邮箱：xxxx@qq.com
 *
 * 数据库
 */


public class DBHelper extends SQLiteOpenHelper{

    public DBHelper(Context context) {
        super(context, BlackListUtils.DB_NAME, null, BlackListUtils.VERSION);
    }
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建表结构
        db.execSQL(BlackListUtils.BlackTable.CREATE_TABLE_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
