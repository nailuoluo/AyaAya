package com.momiji.kotlin.ayaaya.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.momiji.kotlin.ayaaya.R
import com.momiji.kotlin.ayaaya.model.statuses.StatusModel
import kotlinx.android.synthetic.main.itemview_status.view.*

/**
 * Created by liuy314 on 2017/9/13.
 */
class StatusAdapter(val mDataLists: List<StatusModel>): RecyclerView.Adapter<StatusAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): StatusAdapter.ViewHolder {
        val view = View.inflate(parent!!.context, R.layout.itemview_status, null)
        var holder = ViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
//        holder!!.mScreenNameTextView.text = mDataLists.get(position).text
    }

    override fun getItemCount(): Int {
         return mDataLists.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var mAvatarImageView: ImageView
        var mScreenNameTextView: TextView
        var mCreateInfoTextView: TextView
        var mStatusContentTextView: TextView

        init {
            mAvatarImageView = itemView.findViewById(R.id.imageview_avatar)
            mScreenNameTextView = itemView.findViewById(R.id.textView_screenname)
            mCreateInfoTextView = itemView.findViewById(R.id.textView_createAt)
            mStatusContentTextView = itemView.findViewById(R.id.textView_content)
        }
    }

    private fun bindDataToHolder(holder: ViewHolder) {

    }
}