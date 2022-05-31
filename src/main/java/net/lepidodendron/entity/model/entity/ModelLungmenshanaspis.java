package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLungmenshanaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Lungmenshanaspis;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer CornualPlateL;
    private final AdvancedModelRenderer CornualR2_r1;
    private final AdvancedModelRenderer PlateSlatedR_r1;
    private final AdvancedModelRenderer CornualplateR;
    private final AdvancedModelRenderer Plateslated_r1;
    private final AdvancedModelRenderer CornualL2_r1;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Tail;

    public ModelLungmenshanaspis() {
        this.textureWidth = 48;
        this.textureHeight = 36;

        this.Lungmenshanaspis = new AdvancedModelRenderer(this);
        this.Lungmenshanaspis.setRotationPoint(0.0F, 24.0F, 0.0F);

        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(-0.5F, -7.0F, 0.0F);
        this.Lungmenshanaspis.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 0, -0.5F, -1.0F, -18.0F, 1, 1, 10, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 28, -1.0F, -1.3F, -8.0F, 2, 2, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 22, 8, -1.5F, -1.3F, -6.0F, 3, 2, 3, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 10, 20, -2.5F, -1.3F, -3.0F, 5, 2, 3, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 21, 20, -1.0F, -1.5F, -5.0F, 2, 1, 5, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 12, 8, -2.5F, -1.2F, -5.0F, 5, 1, 1, 0.0F, false));

        this.CornualPlateL = new AdvancedModelRenderer(this);
        this.CornualPlateL.setRotationPoint(2.5F, -1.0F, -1.0F);
        this.Cephalon.addChild(CornualPlateL);
        this.setRotateAngle(CornualPlateL, 0.0F, 0.0F, 0.0873F);
        this.CornualPlateL.cubeList.add(new ModelBox(CornualPlateL, 26, 26, 0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.CornualR2_r1 = new AdvancedModelRenderer(this);
        this.CornualR2_r1.setRotationPoint(4.0F, 1.0F, -1.0F);
        this.CornualPlateL.addChild(CornualR2_r1);
        this.setRotateAngle(CornualR2_r1, 0.0F, 0.3403F, 0.0F);
        this.CornualR2_r1.cubeList.add(new ModelBox(CornualR2_r1, 22, 15, -0.5635F, -1.0F, -0.1685F, 6, 1, 1, -0.01F, false));

        this.PlateSlatedR_r1 = new AdvancedModelRenderer(this);
        this.PlateSlatedR_r1.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.CornualPlateL.addChild(PlateSlatedR_r1);
        this.setRotateAngle(PlateSlatedR_r1, 0.0F, -0.9425F, 0.0F);
        this.PlateSlatedR_r1.cubeList.add(new ModelBox(PlateSlatedR_r1, 26, 3, -3.224F, -1.0F, -0.8313F, 4, 1, 2, -0.01F, false));

        this.CornualplateR = new AdvancedModelRenderer(this);
        this.CornualplateR.setRotationPoint(-2.5F, -1.0F, -2.0F);
        this.Cephalon.addChild(CornualplateR);
        this.setRotateAngle(CornualplateR, 0.0F, 0.0F, -0.0873F);
        this.CornualplateR.cubeList.add(new ModelBox(CornualplateR, 16, 26, -4.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.Plateslated_r1 = new AdvancedModelRenderer(this);
        this.Plateslated_r1.setRotationPoint(5.0F, 1.0F, 0.0F);
        this.CornualplateR.addChild(Plateslated_r1);
        this.setRotateAngle(Plateslated_r1, 0.0F, 0.9425F, 0.0F);
        this.Plateslated_r1.cubeList.add(new ModelBox(Plateslated_r1, 26, 0, -3.724F, -1.0F, -5.0313F, 4, 1, 2, -0.01F, false));

        this.CornualL2_r1 = new AdvancedModelRenderer(this);
        this.CornualL2_r1.setRotationPoint(-4.0F, 1.0F, 1.0F);
        this.CornualplateR.addChild(CornualL2_r1);
        this.setRotateAngle(CornualL2_r1, 0.0F, -0.3403F, 0.0F);
        this.CornualL2_r1.cubeList.add(new ModelBox(CornualL2_r1, 22, 13, -6.0161F, -1.0F, -1.0134F, 6, 1, 1, -0.01F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(-0.5F, -7.0F, 0.0F);
        this.Lungmenshanaspis.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 12, 0, -2.0F, -1.3F, 0.0F, 4, 2, 6, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 9, 11, -1.5F, -1.3F, 0.0F, 3, 2, 7, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 20, -1.0F, -1.3F, 0.0F, 2, 2, 6, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body3.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 5, -0.5F, -1.3F, 0.0F, 1, 2, 3, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 3, 0.0F, -2.3F, 1.1F, 0, 6, 8, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 0, -0.5F, -1.3F, 3.0F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        this.Lungmenshanaspis.render(f5 * 0.18F);

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Lungmenshanaspis.offsetY = 1.3F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body1, this.Body2, this.Body3, this.Tail};
        float speed = 0.6F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed * 2, 0.08F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.4F, -3, f2, 0.8F);
            this.swing(Lungmenshanaspis, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Lungmenshanaspis.offsetY = 1.3F;
                this.bob(Lungmenshanaspis, -speed, 5F, false, f2, 1);
            }
        }
    }
}
