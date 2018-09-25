package mdrayefenam.ebs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class NewDonorFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    //  private static final String ARG_PARAM1 = "param1";
    //private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    //private String mParam1;
    // private String mParam2;


    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;


    public NewDonorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_new_donor, container, false);

        listView = (ExpandableListView) view.findViewById(R.id.lv_new_donor_fragment);
        initData();
        listAdapter = new ExpandableListAdapter(getContext(),listDataHeader,listHash);
        listView.setAdapter(listAdapter);


        return view;

    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Personal Info");
        listDataHeader.add("Address Info");
        listDataHeader.add("Contact Info");

        List<String> personalInfo = new ArrayList<>();
        personalInfo.add("Name");
        personalInfo.add("Date Of Birth");
        personalInfo.add("Blood Group");

        List<String> addressInfo = new ArrayList<>();
        addressInfo.add("Home/Holding");
        addressInfo.add("Village");
        addressInfo.add("Ward No");
        addressInfo.add("Road No");
        addressInfo.add("Post Office");
        addressInfo.add("Postal Code");
        addressInfo.add("Upazilla/Thana");
        addressInfo.add("District");
        addressInfo.add("Division");


        List<String> contactInfo = new ArrayList<>();
        contactInfo.add("Phone No");
        contactInfo.add("Mobile No");
        contactInfo.add("Email");

        listHash.put(listDataHeader.get(0),personalInfo);
        listHash.put(listDataHeader.get(1),addressInfo);
        listHash.put(listDataHeader.get(2),contactInfo);


    }

}




