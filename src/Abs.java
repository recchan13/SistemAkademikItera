/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alle
 */

package sistemakademikitera;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Abs {
    abstract boolean login (Connection con) throws SQLException;
}
