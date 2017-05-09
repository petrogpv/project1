package com.project.model.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Ярослав on 09.05.2017.
 *
 * Class to provide localization
 *
 * @author Yaroslav Baranov
 **/
public class ResourceBundleManager {

    public static ResourceBundle getResourceBundle() {
        Locale.setDefault(new Locale("ua", "UK"));
        return ResourceBundle.getBundle("message");
    }
}
