package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPambikalbae extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer frond;
    private final AdvancedModelRenderer chamber1;
    private final AdvancedModelRenderer chamber1bsub_r1;
    private final AdvancedModelRenderer chamber1asub_r1;
    private final AdvancedModelRenderer chamber2;
    private final AdvancedModelRenderer chamber2bsub_r1;
    private final AdvancedModelRenderer chamber2asub_r1;
    private final AdvancedModelRenderer chamber3;
    private final AdvancedModelRenderer chamber3bsub_r1;
    private final AdvancedModelRenderer chamber3asub_r1;
    private final AdvancedModelRenderer chamber4;
    private final AdvancedModelRenderer chamber4bsub_r1;
    private final AdvancedModelRenderer chamber4asub_r1;
    private final AdvancedModelRenderer chamber5;
    private final AdvancedModelRenderer chamber5bsub_r1;
    private final AdvancedModelRenderer chamber5asub_r1;
    private final AdvancedModelRenderer chamber6;
    private final AdvancedModelRenderer chamber6bsub_r1;
    private final AdvancedModelRenderer chamber6asub_r1;
    private final AdvancedModelRenderer chamber7;
    private final AdvancedModelRenderer chamber7asub_r1;
    private final AdvancedModelRenderer chamber7asub_r2;
    private final AdvancedModelRenderer top;
    private final AdvancedModelRenderer topb_r1;
    private final AdvancedModelRenderer topa_r1;

    public ModelPambikalbae() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(8.0F, 24.0F, -8.0F);
        this.bone.cubeList.add(new ModelBox(bone, 8, 13, -9.0F, -1.0F, 7.0F, 2, 1, 2, 0.0F, false));

        this.frond = new AdvancedModelRenderer(this);
        this.frond.setRotationPoint(-8.0F, -2.0F, 8.0F);
        this.bone.addChild(frond);


        this.chamber1 = new AdvancedModelRenderer(this);
        this.chamber1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.frond.addChild(chamber1);
        this.chamber1.cubeList.add(new ModelBox(chamber1, 0, 14, -0.5F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.chamber1.cubeList.add(new ModelBox(chamber1, 0, 12, -0.5F, -4.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.chamber1.cubeList.add(new ModelBox(chamber1, 0, 8, -2.25F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));
        this.chamber1.cubeList.add(new ModelBox(chamber1, 0, 8, 1.25F, -4.0F, -2.25F, 1, 1, 1, 0.0F, false));
        this.chamber1.cubeList.add(new ModelBox(chamber1, 0, 8, 1.25F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));
        this.chamber1.cubeList.add(new ModelBox(chamber1, 0, 8, -2.25F, -4.0F, -2.25F, 1, 1, 1, 0.0F, false));

        this.chamber1bsub_r1 = new AdvancedModelRenderer(this);
        this.chamber1bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber1.addChild(chamber1bsub_r1);
        this.setRotateAngle(chamber1bsub_r1, 0.0F, 0.7854F, 0.0F);
        this.chamber1bsub_r1.cubeList.add(new ModelBox(chamber1bsub_r1, 6, 0, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber1asub_r1 = new AdvancedModelRenderer(this);
        this.chamber1asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber1.addChild(chamber1asub_r1);
        this.setRotateAngle(chamber1asub_r1, 0.0F, -0.7854F, 0.0F);
        this.chamber1asub_r1.cubeList.add(new ModelBox(chamber1asub_r1, 6, 0, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber2 = new AdvancedModelRenderer(this);
        this.chamber2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber1.addChild(chamber2);
        this.chamber2.cubeList.add(new ModelBox(chamber2, 0, 10, -0.5F, -5.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.chamber2.cubeList.add(new ModelBox(chamber2, 0, 8, -0.5F, -6.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.chamber2.cubeList.add(new ModelBox(chamber2, 0, 8, -2.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));
        this.chamber2.cubeList.add(new ModelBox(chamber2, 0, 8, 1.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));
        this.chamber2.cubeList.add(new ModelBox(chamber2, 0, 8, 1.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));
        this.chamber2.cubeList.add(new ModelBox(chamber2, 0, 8, -2.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));

        this.chamber2bsub_r1 = new AdvancedModelRenderer(this);
        this.chamber2bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber2.addChild(chamber2bsub_r1);
        this.setRotateAngle(chamber2bsub_r1, 0.0F, 0.7854F, 0.0F);
        this.chamber2bsub_r1.cubeList.add(new ModelBox(chamber2bsub_r1, 6, 0, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber2asub_r1 = new AdvancedModelRenderer(this);
        this.chamber2asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber2.addChild(chamber2asub_r1);
        this.setRotateAngle(chamber2asub_r1, 0.0F, -0.7854F, 0.0F);
        this.chamber2asub_r1.cubeList.add(new ModelBox(chamber2asub_r1, 6, 0, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber3 = new AdvancedModelRenderer(this);
        this.chamber3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.chamber2.addChild(chamber3);
        this.chamber3.cubeList.add(new ModelBox(chamber3, 0, 6, -0.5F, -5.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.chamber3.cubeList.add(new ModelBox(chamber3, 0, 4, -0.5F, -6.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.chamber3.cubeList.add(new ModelBox(chamber3, 0, 8, -2.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));
        this.chamber3.cubeList.add(new ModelBox(chamber3, 0, 8, 1.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));
        this.chamber3.cubeList.add(new ModelBox(chamber3, 0, 8, -2.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));
        this.chamber3.cubeList.add(new ModelBox(chamber3, 0, 8, 1.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));

        this.chamber3bsub_r1 = new AdvancedModelRenderer(this);
        this.chamber3bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber3.addChild(chamber3bsub_r1);
        this.setRotateAngle(chamber3bsub_r1, 0.0F, 0.7854F, 0.0F);
        this.chamber3bsub_r1.cubeList.add(new ModelBox(chamber3bsub_r1, 6, 0, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber3asub_r1 = new AdvancedModelRenderer(this);
        this.chamber3asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber3.addChild(chamber3asub_r1);
        this.setRotateAngle(chamber3asub_r1, 0.0F, -0.7854F, 0.0F);
        this.chamber3asub_r1.cubeList.add(new ModelBox(chamber3asub_r1, 6, 0, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber4 = new AdvancedModelRenderer(this);
        this.chamber4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.chamber3.addChild(chamber4);
        this.chamber4.cubeList.add(new ModelBox(chamber4, 0, 2, -0.5F, -5.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.chamber4.cubeList.add(new ModelBox(chamber4, 0, 8, -2.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));
        this.chamber4.cubeList.add(new ModelBox(chamber4, 0, 8, 1.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));
        this.chamber4.cubeList.add(new ModelBox(chamber4, 0, 8, 1.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));
        this.chamber4.cubeList.add(new ModelBox(chamber4, 0, 8, -2.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));

        this.chamber4bsub_r1 = new AdvancedModelRenderer(this);
        this.chamber4bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber4.addChild(chamber4bsub_r1);
        this.setRotateAngle(chamber4bsub_r1, 0.0F, 0.7854F, 0.0F);
        this.chamber4bsub_r1.cubeList.add(new ModelBox(chamber4bsub_r1, 6, 0, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber4asub_r1 = new AdvancedModelRenderer(this);
        this.chamber4asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber4.addChild(chamber4asub_r1);
        this.setRotateAngle(chamber4asub_r1, 0.0F, -0.7854F, 0.0F);
        this.chamber4asub_r1.cubeList.add(new ModelBox(chamber4asub_r1, 6, 0, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber5 = new AdvancedModelRenderer(this);
        this.chamber5.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.chamber4.addChild(chamber5);
        this.chamber5.cubeList.add(new ModelBox(chamber5, 0, 0, -0.5F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.chamber5.cubeList.add(new ModelBox(chamber5, 0, 14, -0.5F, -4.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.chamber5.cubeList.add(new ModelBox(chamber5, 0, 8, -2.25F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));
        this.chamber5.cubeList.add(new ModelBox(chamber5, 0, 8, 1.25F, -4.0F, -2.25F, 1, 1, 1, 0.0F, false));
        this.chamber5.cubeList.add(new ModelBox(chamber5, 0, 8, -2.25F, -4.0F, -2.25F, 1, 1, 1, 0.0F, false));
        this.chamber5.cubeList.add(new ModelBox(chamber5, 0, 8, 1.25F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));

        this.chamber5bsub_r1 = new AdvancedModelRenderer(this);
        this.chamber5bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber5.addChild(chamber5bsub_r1);
        this.setRotateAngle(chamber5bsub_r1, 0.0F, 0.7854F, 0.0F);
        this.chamber5bsub_r1.cubeList.add(new ModelBox(chamber5bsub_r1, 6, 0, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber5asub_r1 = new AdvancedModelRenderer(this);
        this.chamber5asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber5.addChild(chamber5asub_r1);
        this.setRotateAngle(chamber5asub_r1, 0.0F, -0.7854F, 0.0F);
        this.chamber5asub_r1.cubeList.add(new ModelBox(chamber5asub_r1, 6, 0, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber6 = new AdvancedModelRenderer(this);
        this.chamber6.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.chamber5.addChild(chamber6);
        this.chamber6.cubeList.add(new ModelBox(chamber6, 0, 12, -0.5F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.chamber6.cubeList.add(new ModelBox(chamber6, 0, 8, -2.25F, -3.5F, 1.25F, 1, 1, 1, 0.0F, false));
        this.chamber6.cubeList.add(new ModelBox(chamber6, 0, 8, 1.25F, -3.5F, -2.25F, 1, 1, 1, 0.0F, false));
        this.chamber6.cubeList.add(new ModelBox(chamber6, 0, 8, 1.25F, -3.5F, 1.25F, 1, 1, 1, 0.0F, false));
        this.chamber6.cubeList.add(new ModelBox(chamber6, 0, 8, -2.25F, -3.5F, -2.25F, 1, 1, 1, 0.0F, false));

        this.chamber6bsub_r1 = new AdvancedModelRenderer(this);
        this.chamber6bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber6.addChild(chamber6bsub_r1);
        this.setRotateAngle(chamber6bsub_r1, 0.0F, 0.7854F, 0.0F);
        this.chamber6bsub_r1.cubeList.add(new ModelBox(chamber6bsub_r1, 6, 0, 0.0F, -3.5F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber6asub_r1 = new AdvancedModelRenderer(this);
        this.chamber6asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber6.addChild(chamber6asub_r1);
        this.setRotateAngle(chamber6asub_r1, 0.0F, -0.7854F, 0.0F);
        this.chamber6asub_r1.cubeList.add(new ModelBox(chamber6asub_r1, 6, 0, 0.0F, -3.5F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber7 = new AdvancedModelRenderer(this);
        this.chamber7.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.chamber6.addChild(chamber7);
        this.chamber7.cubeList.add(new ModelBox(chamber7, 0, 10, -0.5F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.chamber7.cubeList.add(new ModelBox(chamber7, 0, 8, -2.0F, -4.0F, 1.0F, 1, 1, 1, 0.0F, false));
        this.chamber7.cubeList.add(new ModelBox(chamber7, 0, 8, 1.0F, -4.0F, -2.0F, 1, 1, 1, 0.0F, false));
        this.chamber7.cubeList.add(new ModelBox(chamber7, 0, 8, 1.0F, -4.0F, 1.0F, 1, 1, 1, 0.0F, false));
        this.chamber7.cubeList.add(new ModelBox(chamber7, 0, 8, -2.0F, -4.0F, -2.0F, 1, 1, 1, 0.0F, false));

        this.chamber7asub_r1 = new AdvancedModelRenderer(this);
        this.chamber7asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber7.addChild(chamber7asub_r1);
        this.setRotateAngle(chamber7asub_r1, 0.0F, 0.7854F, 0.0F);
        this.chamber7asub_r1.cubeList.add(new ModelBox(chamber7asub_r1, 6, 0, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.chamber7asub_r2 = new AdvancedModelRenderer(this);
        this.chamber7asub_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber7.addChild(chamber7asub_r2);
        this.setRotateAngle(chamber7asub_r2, 0.0F, -0.7854F, 0.0F);
        this.chamber7asub_r2.cubeList.add(new ModelBox(chamber7asub_r2, 6, 0, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.top = new AdvancedModelRenderer(this);
        this.top.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chamber7.addChild(top);
        this.top.cubeList.add(new ModelBox(top, 0, 10, -0.5F, -4.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.topb_r1 = new AdvancedModelRenderer(this);
        this.topb_r1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.top.addChild(topb_r1);
        this.setRotateAngle(topb_r1, 0.0F, 0.7854F, 0.0F);
        this.topb_r1.cubeList.add(new ModelBox(topb_r1, 10, 5, 0.0F, -14.0F, -1.5F, 0, 3, 3, 0.0F, false));
        this.topb_r1.cubeList.add(new ModelBox(topb_r1, 10, 9, -0.01F, -11.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.topa_r1 = new AdvancedModelRenderer(this);
        this.topa_r1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.top.addChild(topa_r1);
        this.setRotateAngle(topa_r1, 0.0F, -0.7854F, 0.0F);
        this.topa_r1.cubeList.add(new ModelBox(topa_r1, 10, 5, 0.0F, -14.0F, -1.5F, 0, 3, 3, 0.0F, false));
        this.topa_r1.cubeList.add(new ModelBox(topa_r1, 10, 9, -0.01F, -11.5F, -1.5F, 0, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        AdvancedModelRenderer[] Frond = {this.chamber1,this.chamber2,this.chamber3,this.chamber4,this.chamber5,this.chamber6,this.chamber7,this.top};
        float speed = 0.045F;
        this.chainWave(Frond, speed, 0.1F, 4, f, 0.35F);
        this.chainFlap(Frond, speed, 0.1F, 4, f, 0.35F);
        this.bone.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
