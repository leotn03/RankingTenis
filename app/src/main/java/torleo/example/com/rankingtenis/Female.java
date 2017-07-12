package torleo.example.com.rankingtenis;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Female extends Fragment {
    private Context context;

    private String uid;
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private String profile_pic;

    public Female() {
        // Required empty public constructor
    }

    /**
     * Create a fragment that contains the login tab
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_female, container, false);
        Button signIn = (Button) view.findViewById(R.id.bSignInFemale);
        /*signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "Succesfully", Toast.LENGTH_LONG).show();

            }
        });*/
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
