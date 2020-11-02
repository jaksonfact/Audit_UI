package com.example.audit_ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.audit_ui.R;
import com.example.audit_ui.fragments.OpenScheduleFragment;
import com.example.audit_ui.model.OpenScheduleModel;

import java.util.ArrayList;


public class OpenScheduleAdapter extends RecyclerView.Adapter<OpenScheduleAdapter.MyViewHolder> {


    Context context;
    ArrayList<OpenScheduleModel> openScheduleDataList;



    public OpenScheduleAdapter(Context context, ArrayList<OpenScheduleModel> data) {
        this.context = context;
        this.openScheduleDataList = data;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_open_schedule, viewGroup, false);

        return new MyViewHolder(itemView);


    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        OpenScheduleModel openScheduleModel = openScheduleDataList.get(position);
        TextView scheduleDate=holder.scheduleDate;
        TextView hubName=holder.hubName;
        TextView wareHouse=holder.wareHouse;
        TextView audit=holder.audit;
        scheduleDate.setText(openScheduleModel.getSheduleDate());
        hubName.setText(openScheduleModel.getHubName());
        wareHouse.setText(openScheduleModel.getWarehouseName());
        audit.setText(openScheduleModel.getAuditType());
    }

    @Override
    public int getItemCount() {
        return openScheduleDataList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView scheduleDate;
        TextView hubName;
        TextView wareHouse;
        TextView audit;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.scheduleDate=itemView.findViewById(R.id.scheduleDate);
            this.hubName=itemView.findViewById(R.id.hubName);
            this.wareHouse=itemView.findViewById(R.id.warehouseName);
            this.audit=itemView.findViewById(R.id.auditType);

        }
    }




}
