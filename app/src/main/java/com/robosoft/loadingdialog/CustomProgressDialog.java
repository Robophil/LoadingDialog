package com.robosoft.loadingdialog;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

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
    public CustomProgressDialog show(CharSequence message) {

        dialog = new CustomProgressDialog(mContext, R.style.ProgressDialog);
        dialog.setContentView(R.layout.custom_dialog);

        progress1 = (MaterialProgressBar) dialog.findViewById(R.id.progress1);
        textview = (TextView) dialog.findViewById(R.id.dialog_message);
        textview.setText(message);


        progress1.setColorSchemeResources(R.color.red, R.color.green, R.color.blue, R.color.orange);
        dialog.setCancelable(false);
        if (dialog != null) {
            dialog.show();
        }
        return dialog;
    }

    public CustomProgressDialog dismiss(CharSequence message) {
        if (dialog != null) {
            textview.setText(message);
            dialog.dismiss();
        }

        return dialog;

    }

}
