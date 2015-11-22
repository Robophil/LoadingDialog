package com.robosoft.loadingdialog;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

import com.robosoft.loadingdialog.widget.MaterialProgressBar;


public class CustomProgressDialog extends Dialog {
    MaterialProgressBar progress1;

    Context mContext;
    CustomProgressDialog dialog;
    private TextView textview;

    public CustomProgressDialog(Context context) {
        super(context);
        this.mContext = context;
    }

    public CustomProgressDialog(Context context, int theme) {
        super(context, theme);
    }

    /**
     * Display the custom progress dialog
     *
     * @param message
     * @return
     */
    public CustomProgressDialog show(CharSequence message, boolean cancelabele) {

        dialog = new CustomProgressDialog(mContext, R.style.ProgressDialog);
        dialog.setContentView(R.layout.custom_dialog);

        progress1 = (MaterialProgressBar) dialog.findViewById(R.id.progress1);
        textview = (TextView) dialog.findViewById(R.id.dialog_message);

        //set message to be shown alongside spinner
        textview.setText(message);


        progress1.setColorSchemeResources(R.color.red, R.color.green, R.color.blue, R.color.orange);
        dialog.setCancelable(cancelabele);
        if (dialog != null) {
            dialog.show();
        }
        return dialog;
    }

    public CustomProgressDialog dismiss(CharSequence message) {
        if (dialog != null) {
            if(message != null){
                Toast.makeText(getContext(),message,Toast.LENGTH_SHORT).show();
            }

            dialog.dismiss();
        }

        return dialog;

    }

}
