package com.example.audit_ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.audit_ui.R;
import com.example.audit_ui.adapter.CloseScheduleAdapter;
import com.example.audit_ui.adapter.OpenScheduleAdapter;
import com.example.audit_ui.model.CloseScheduleModel;
import com.example.audit_ui.model.OpenScheduleModel;

import java.util.ArrayList;


public class CloseScheduleFragment extends Fragment {
    RecyclerView mRecyclerView;
    CloseScheduleAdapter adapter;
    private TextView scheduleDate;
    private TextView hubName;
    private TextView wareHouse;
    private TextView audit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_close_schedule, container, false);

        return view;

        }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            mRecyclerView = view.findViewById(R.id.closeRecyclerView);
            scheduleDate = view.findViewById(R.id.scheduleDate);
            hubName = view.findViewById(R.id.hubName);
            wareHouse = view.findViewById(R.id.warehouseName);
            audit = view.findViewById(R.id.auditType);
            final LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
            mRecyclerView.setLayoutManager(layoutManager);

            ArrayList<CloseScheduleModel> data = listData();

            adapter = new CloseScheduleAdapter(getContext(),data);
            mRecyclerView.setAdapter(adapter);
            mRecyclerView.setVisibility(View.VISIBLE);

        }

        public ArrayList<CloseScheduleModel> listData (){
            ArrayList<CloseScheduleModel> closeList = new ArrayList<>();
            CloseScheduleModel data1 = new CloseScheduleModel();
            data1.setSheduleDate("29-Jul-2020");
            data1.setHubName("Ikara");
            data1.setWarehouseName("Kauru");
            data1.setAuditType("Specific Product Group");
            closeList.add(data1);

            CloseScheduleModel data2 = new CloseScheduleModel();
            data2.setSheduleDate("20-Jan-2020");
            data2.setHubName("Jacky2");
            data2.setWarehouseName("King2");
            data2.setAuditType("Specific Product Group2");
            closeList.add(data2);

            CloseScheduleModel data3 = new CloseScheduleModel();
            data3.setSheduleDate("01-Jun-2020");
            data3.setHubName("Ikara3");
            data3.setWarehouseName("Kauru3");
            data3.setAuditType("Specific Product Group3");
            closeList.add(data3);

            CloseScheduleModel data4 = new CloseScheduleModel();
            data4.setSheduleDate("29-Jul-2020");
            data4.setHubName("Ikara4");
            data4.setWarehouseName("Kauru4");
            data4.setAuditType("Specific Product Group4");
            closeList.add(data4);

            CloseScheduleModel data5 = new CloseScheduleModel();
            data5.setSheduleDate("29-Jul-2020");
            data5.setHubName("Ikara5");
            data5.setWarehouseName("Kauru5");
            data5.setAuditType("Specific Product Group5");
            closeList.add(data5);

            CloseScheduleModel data6 = new CloseScheduleModel();
            data6.setSheduleDate("29-Jul-2020");
            data6.setHubName("Ikara6");
            data6.setWarehouseName("Kauru6");
            data6.setAuditType("Specific Product Group6");
            closeList.add(data6);


            return closeList;
    }
}