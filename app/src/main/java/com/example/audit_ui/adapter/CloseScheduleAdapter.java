package com.example.audit_ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.audit_ui.R;
import com.example.audit_ui.model.CloseScheduleModel;

import java.util.ArrayList;

public class CloseScheduleAdapter  extends RecyclerView.Adapter<CloseScheduleAdapter.MyViewHolder> {

    Context context;
    ArrayList<CloseScheduleModel> closeScheduleDataList;



    public CloseScheduleAdapter(Context context, ArrayList<CloseScheduleModel> data) {
        this.context = context;
        this.closeScheduleDataList = data;
    }


    @NonNull
    @Override
    public CloseScheduleAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_close_schedule, viewGroup, false);
        return new CloseScheduleAdapter.MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull CloseScheduleAdapter.MyViewHolder holder, int position) {
        CloseScheduleModel closeScheduleModel = closeScheduleDataList.get(position);
        TextView scheduleDate=holder.scheduleDate;
        TextView hubName=holder.hubName;
        TextView wareHouse=holder.wareHouse;
        TextView audit=holder.audit;
        scheduleDate.setText(closeScheduleModel.getSheduleDate());
        hubName.setText(closeScheduleModel.getHubName());
        wareHouse.setText(closeScheduleModel.getWarehouseName());
        audit.setText(closeScheduleModel.getAuditType());
    }

    @Override
    public int getItemCount() {
        return closeScheduleDataList.size();
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
