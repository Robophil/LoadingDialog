# LoadingDialog
A loading dialog showing intermediate progress implemented in material designs for older devices.

Simply include the project as a module and add as a compile dependency in app:build.gradle file
compile project(':LoadingDialog')
###Example below
```gradle
    dependencies {
        compile fileTree(dir: 'libs', include: ['*.jar'])
        compile 'com.android.support:appcompat-v7:23.1.1'
        compile project(':LoadingDialog')
    }
```

If you imported as a module, android studio will add the following ':LoadingDialog' for you, else add it yourself
manually to the settings.gradle file
    include ':app', ':LoadingDialog'

##How to use(Example)
```java
    import com.robosoft.loadingdialog.CustomProgressDialog
    /**
    * Call method to show dialog
    * String, Boolean
    */
    public showDialog(message_to_be_shown_with_loadingwheel, dismiss_when_screen_is_clicked)
    /**
    * Call method to dismiss. Pass a string to show as toast when done
    * String
    */
    public dismiss(dismiss_text);
 ```

###Sample code
```java
    import android.app.Activity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import com.robosoft.loadingdialog.CustomProgressDialog;


    public class MainActivity extends Activity{
        private CustomProgressDialog customProgressDialog;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
            Button button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    customProgressDialog = new CustomProgressDialog(MainActivity.this);
                    customProgressDialog.showDialog("Loading....u go wait tire", true);
                }
            });
        }
    }
```
##Special Thanks
http://takeoffandroid.com/dialog/material-progress-dialog-using-v4-support-library/
