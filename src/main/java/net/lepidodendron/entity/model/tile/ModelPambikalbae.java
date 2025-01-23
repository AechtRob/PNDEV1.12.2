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
        textureWidth = 32;
        textureHeight = 32;

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(8.0F, 24.0F, -8.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -9.0F, -1.0F, 7.0F, 2, 1, 2, 0.0F, false));

        frond = new AdvancedModelRenderer(this);
        frond.setRotationPoint(-8.0F, -2.0F, 8.0F);
        bone.addChild(frond);


        chamber1 = new AdvancedModelRenderer(this);
        chamber1.setRotationPoint(0.0F, 3.0F, 0.0F);
        frond.addChild(chamber1);
        chamber1.cubeList.add(new ModelBox(chamber1, 10, 9, -0.5F, -4.0F, -0.5F, 1, 2, 1, 0.0F, false));
        chamber1.cubeList.add(new ModelBox(chamber1, 6, 0, -2.25F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));
        chamber1.cubeList.add(new ModelBox(chamber1, 6, 0, 1.25F, -4.0F, -2.25F, 1, 1, 1, 0.0F, false));
        chamber1.cubeList.add(new ModelBox(chamber1, 6, 0, 1.25F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));
        chamber1.cubeList.add(new ModelBox(chamber1, 6, 0, -2.25F, -4.0F, -2.25F, 1, 1, 1, 0.0F, false));

        chamber1bsub_r1 = new AdvancedModelRenderer(this);
        chamber1bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber1.addChild(chamber1bsub_r1);
        setRotateAngle(chamber1bsub_r1, 0.0F, 0.7854F, 0.0F);
        chamber1bsub_r1.cubeList.add(new ModelBox(chamber1bsub_r1, 0, 12, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber1asub_r1 = new AdvancedModelRenderer(this);
        chamber1asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber1.addChild(chamber1asub_r1);
        setRotateAngle(chamber1asub_r1, 0.0F, -0.7854F, 0.0F);
        chamber1asub_r1.cubeList.add(new ModelBox(chamber1asub_r1, 0, 12, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber2 = new AdvancedModelRenderer(this);
        chamber2.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber1.addChild(chamber2);
        chamber2.cubeList.add(new ModelBox(chamber2, 13, 2, -0.5F, -6.0F, -0.5F, 1, 2, 1, 0.0F, false));
        chamber2.cubeList.add(new ModelBox(chamber2, 6, 0, -2.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));
        chamber2.cubeList.add(new ModelBox(chamber2, 6, 0, 1.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));
        chamber2.cubeList.add(new ModelBox(chamber2, 6, 0, 1.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));
        chamber2.cubeList.add(new ModelBox(chamber2, 6, 0, -2.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));

        chamber2bsub_r1 = new AdvancedModelRenderer(this);
        chamber2bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber2.addChild(chamber2bsub_r1);
        setRotateAngle(chamber2bsub_r1, 0.0F, 0.7854F, 0.0F);
        chamber2bsub_r1.cubeList.add(new ModelBox(chamber2bsub_r1, 0, 10, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber2asub_r1 = new AdvancedModelRenderer(this);
        chamber2asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber2.addChild(chamber2asub_r1);
        setRotateAngle(chamber2asub_r1, 0.0F, -0.7854F, 0.0F);
        chamber2asub_r1.cubeList.add(new ModelBox(chamber2asub_r1, 0, 10, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber3 = new AdvancedModelRenderer(this);
        chamber3.setRotationPoint(0.0F, -2.0F, 0.0F);
        chamber2.addChild(chamber3);
        chamber3.cubeList.add(new ModelBox(chamber3, 10, 0, -0.5F, -6.0F, -0.5F, 1, 2, 1, 0.0F, false));
        chamber3.cubeList.add(new ModelBox(chamber3, 6, 0, -2.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));
        chamber3.cubeList.add(new ModelBox(chamber3, 6, 0, 1.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));
        chamber3.cubeList.add(new ModelBox(chamber3, 6, 0, -2.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));
        chamber3.cubeList.add(new ModelBox(chamber3, 6, 0, 1.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));

        chamber3bsub_r1 = new AdvancedModelRenderer(this);
        chamber3bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber3.addChild(chamber3bsub_r1);
        setRotateAngle(chamber3bsub_r1, 0.0F, 0.7854F, 0.0F);
        chamber3bsub_r1.cubeList.add(new ModelBox(chamber3bsub_r1, 0, 8, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber3asub_r1 = new AdvancedModelRenderer(this);
        chamber3asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber3.addChild(chamber3asub_r1);
        setRotateAngle(chamber3asub_r1, 0.0F, -0.7854F, 0.0F);
        chamber3asub_r1.cubeList.add(new ModelBox(chamber3asub_r1, 0, 8, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber4 = new AdvancedModelRenderer(this);
        chamber4.setRotationPoint(0.0F, -2.0F, 0.0F);
        chamber3.addChild(chamber4);
        chamber4.cubeList.add(new ModelBox(chamber4, 0, 3, -0.5F, -5.0F, -0.5F, 1, 1, 1, 0.0F, false));
        chamber4.cubeList.add(new ModelBox(chamber4, 6, 0, -2.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));
        chamber4.cubeList.add(new ModelBox(chamber4, 6, 0, 1.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));
        chamber4.cubeList.add(new ModelBox(chamber4, 6, 0, 1.5F, -5.5F, 1.5F, 1, 1, 1, 0.0F, false));
        chamber4.cubeList.add(new ModelBox(chamber4, 6, 0, -2.5F, -5.5F, -2.5F, 1, 1, 1, 0.0F, false));

        chamber4bsub_r1 = new AdvancedModelRenderer(this);
        chamber4bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber4.addChild(chamber4bsub_r1);
        setRotateAngle(chamber4bsub_r1, 0.0F, 0.7854F, 0.0F);
        chamber4bsub_r1.cubeList.add(new ModelBox(chamber4bsub_r1, 0, 6, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber4asub_r1 = new AdvancedModelRenderer(this);
        chamber4asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber4.addChild(chamber4asub_r1);
        setRotateAngle(chamber4asub_r1, 0.0F, -0.7854F, 0.0F);
        chamber4asub_r1.cubeList.add(new ModelBox(chamber4asub_r1, 0, 6, 0.0F, -5.5F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber5 = new AdvancedModelRenderer(this);
        chamber5.setRotationPoint(0.0F, -3.0F, 0.0F);
        chamber4.addChild(chamber5);
        chamber5.cubeList.add(new ModelBox(chamber5, 7, 2, -0.5F, -4.0F, -0.5F, 1, 2, 1, 0.0F, false));
        chamber5.cubeList.add(new ModelBox(chamber5, 6, 0, -2.25F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));
        chamber5.cubeList.add(new ModelBox(chamber5, 6, 0, 1.25F, -4.0F, -2.25F, 1, 1, 1, 0.0F, false));
        chamber5.cubeList.add(new ModelBox(chamber5, 6, 0, -2.25F, -4.0F, -2.25F, 1, 1, 1, 0.0F, false));
        chamber5.cubeList.add(new ModelBox(chamber5, 6, 0, 1.25F, -4.0F, 1.25F, 1, 1, 1, 0.0F, false));

        chamber5bsub_r1 = new AdvancedModelRenderer(this);
        chamber5bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber5.addChild(chamber5bsub_r1);
        setRotateAngle(chamber5bsub_r1, 0.0F, 0.7854F, 0.0F);
        chamber5bsub_r1.cubeList.add(new ModelBox(chamber5bsub_r1, 0, 4, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber5asub_r1 = new AdvancedModelRenderer(this);
        chamber5asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber5.addChild(chamber5asub_r1);
        setRotateAngle(chamber5asub_r1, 0.0F, -0.7854F, 0.0F);
        chamber5asub_r1.cubeList.add(new ModelBox(chamber5asub_r1, 0, 4, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber6 = new AdvancedModelRenderer(this);
        chamber6.setRotationPoint(0.0F, -2.0F, 0.0F);
        chamber5.addChild(chamber6);
        chamber6.cubeList.add(new ModelBox(chamber6, 10, 14, -0.5F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
        chamber6.cubeList.add(new ModelBox(chamber6, 6, 0, -2.25F, -3.5F, 1.25F, 1, 1, 1, 0.0F, false));
        chamber6.cubeList.add(new ModelBox(chamber6, 6, 0, 1.25F, -3.5F, -2.25F, 1, 1, 1, 0.0F, false));
        chamber6.cubeList.add(new ModelBox(chamber6, 6, 0, 1.25F, -3.5F, 1.25F, 1, 1, 1, 0.0F, false));
        chamber6.cubeList.add(new ModelBox(chamber6, 6, 0, -2.25F, -3.5F, -2.25F, 1, 1, 1, 0.0F, false));

        chamber6bsub_r1 = new AdvancedModelRenderer(this);
        chamber6bsub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber6.addChild(chamber6bsub_r1);
        setRotateAngle(chamber6bsub_r1, 0.0F, 0.7854F, 0.0F);
        chamber6bsub_r1.cubeList.add(new ModelBox(chamber6bsub_r1, 0, 2, 0.0F, -3.5F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber6asub_r1 = new AdvancedModelRenderer(this);
        chamber6asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber6.addChild(chamber6asub_r1);
        setRotateAngle(chamber6asub_r1, 0.0F, -0.7854F, 0.0F);
        chamber6asub_r1.cubeList.add(new ModelBox(chamber6asub_r1, 0, 2, 0.0F, -3.5F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber7 = new AdvancedModelRenderer(this);
        chamber7.setRotationPoint(0.0F, -1.0F, 0.0F);
        chamber6.addChild(chamber7);
        chamber7.cubeList.add(new ModelBox(chamber7, 10, 16, -0.5F, -3.0F, -0.5F, 1, 1, 1, 0.0F, false));
        chamber7.cubeList.add(new ModelBox(chamber7, 6, 0, -2.0F, -4.0F, 1.0F, 1, 1, 1, 0.0F, false));
        chamber7.cubeList.add(new ModelBox(chamber7, 6, 0, 1.0F, -4.0F, -2.0F, 1, 1, 1, 0.0F, false));
        chamber7.cubeList.add(new ModelBox(chamber7, 6, 0, 1.0F, -4.0F, 1.0F, 1, 1, 1, 0.0F, false));
        chamber7.cubeList.add(new ModelBox(chamber7, 6, 0, -2.0F, -4.0F, -2.0F, 1, 1, 1, 0.0F, false));

        chamber7asub_r1 = new AdvancedModelRenderer(this);
        chamber7asub_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber7.addChild(chamber7asub_r1);
        setRotateAngle(chamber7asub_r1, 0.0F, 0.7854F, 0.0F);
        chamber7asub_r1.cubeList.add(new ModelBox(chamber7asub_r1, 0, 0, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        chamber7asub_r2 = new AdvancedModelRenderer(this);
        chamber7asub_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber7.addChild(chamber7asub_r2);
        setRotateAngle(chamber7asub_r2, 0.0F, -0.7854F, 0.0F);
        chamber7asub_r2.cubeList.add(new ModelBox(chamber7asub_r2, 0, 0, 0.0F, -4.0F, -2.5F, 0, 2, 5, 0.0F, false));

        top = new AdvancedModelRenderer(this);
        top.setRotationPoint(0.0F, 0.0F, 0.0F);
        chamber7.addChild(top);
        top.cubeList.add(new ModelBox(top, 10, 12, -0.5F, -4.0F, -0.5F, 1, 1, 1, 0.0F, false));

        topb_r1 = new AdvancedModelRenderer(this);
        topb_r1.setRotationPoint(0.0F, 7.0F, 0.0F);
        top.addChild(topb_r1);
        setRotateAngle(topb_r1, 0.0F, 0.7854F, 0.0F);
        topb_r1.cubeList.add(new ModelBox(topb_r1, 10, 2, 0.0F, -14.0F, -1.5F, 0, 4, 3, 0.0F, false));

        topa_r1 = new AdvancedModelRenderer(this);
        topa_r1.setRotationPoint(0.0F, 7.0F, 0.0F);
        top.addChild(topa_r1);
        setRotateAngle(topa_r1, 0.0F, -0.7854F, 0.0F);
        topa_r1.cubeList.add(new ModelBox(topa_r1, 10, 2, 0.0F, -14.0F, -1.5F, 0, 4, 3, 0.0F, false));

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
