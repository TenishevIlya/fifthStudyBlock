package com.example.hp.thenewestproject;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

public class FotoDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder buildDialog = new AlertDialog.Builder(getActivity());
        return buildDialog
               .setView(R.layout.foto_dialog_view)
                .create();
    }
}
