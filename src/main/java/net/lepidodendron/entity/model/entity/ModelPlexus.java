package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPlexus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPlexus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer bone8;
    private final AdvancedModelRenderer bone9;
    private final AdvancedModelRenderer bone10;
    private final AdvancedModelRenderer bone11;
    private final AdvancedModelRenderer bone12;
    private final AdvancedModelRenderer bone13;
    private final AdvancedModelRenderer bone14;
    private final AdvancedModelRenderer bone15;
    private final AdvancedModelRenderer bone16;
    private final AdvancedModelRenderer bone17;
    private final AdvancedModelRenderer bone18;
    private final AdvancedModelRenderer bone19;
    private final AdvancedModelRenderer bone20;
    private final AdvancedModelRenderer bone21;
    private final AdvancedModelRenderer bone22;

    public ModelPlexus() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 19.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 12, -1.0F, -2.0F, -1.0F, 2, 2, 2, -0.01F, false));

        bone2 = new AdvancedModelRenderer(this);
        bone2.setRotationPoint(0.0F, -1.0F, -1.5F);
        bone.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 0, 8, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 4, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone3 = new AdvancedModelRenderer(this);
        bone3.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone2.addChild(bone3);
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 12, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone4 = new AdvancedModelRenderer(this);
        bone4.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone3.addChild(bone4);
        bone4.cubeList.add(new ModelBox(bone4, 0, 8, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 4, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone5 = new AdvancedModelRenderer(this);
        bone5.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone4.addChild(bone5);
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 12, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone6 = new AdvancedModelRenderer(this);
        bone6.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone5.addChild(bone6);
        bone6.cubeList.add(new ModelBox(bone6, 0, 8, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 4, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone7 = new AdvancedModelRenderer(this);
        bone7.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone6.addChild(bone7);
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 12, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone8 = new AdvancedModelRenderer(this);
        bone8.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone7.addChild(bone8);
        bone8.cubeList.add(new ModelBox(bone8, 0, 8, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 4, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone9 = new AdvancedModelRenderer(this);
        bone9.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone8.addChild(bone9);
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone9.cubeList.add(new ModelBox(bone9, 0, 12, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone10 = new AdvancedModelRenderer(this);
        bone10.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone9.addChild(bone10);
        bone10.cubeList.add(new ModelBox(bone10, 0, 8, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 0, 4, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone11 = new AdvancedModelRenderer(this);
        bone11.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone10.addChild(bone11);
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone11.cubeList.add(new ModelBox(bone11, 0, 12, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone12 = new AdvancedModelRenderer(this);
        bone12.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone11.addChild(bone12);
        bone12.cubeList.add(new ModelBox(bone12, 0, 8, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 0, 4, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone13 = new AdvancedModelRenderer(this);
        bone13.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone12.addChild(bone13);
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone13.cubeList.add(new ModelBox(bone13, 0, 12, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone14 = new AdvancedModelRenderer(this);
        bone14.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone13.addChild(bone14);
        bone14.cubeList.add(new ModelBox(bone14, 0, 8, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 0, 4, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone15 = new AdvancedModelRenderer(this);
        bone15.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone14.addChild(bone15);
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone15.cubeList.add(new ModelBox(bone15, 0, 12, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone16 = new AdvancedModelRenderer(this);
        bone16.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone15.addChild(bone16);
        bone16.cubeList.add(new ModelBox(bone16, 0, 8, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone16.cubeList.add(new ModelBox(bone16, 0, 4, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone17 = new AdvancedModelRenderer(this);
        bone17.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone16.addChild(bone17);
        bone17.cubeList.add(new ModelBox(bone17, 0, 0, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone17.cubeList.add(new ModelBox(bone17, 0, 12, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone18 = new AdvancedModelRenderer(this);
        bone18.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone17.addChild(bone18);
        bone18.cubeList.add(new ModelBox(bone18, 0, 8, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone18.cubeList.add(new ModelBox(bone18, 0, 4, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone19 = new AdvancedModelRenderer(this);
        bone19.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone18.addChild(bone19);
        bone19.cubeList.add(new ModelBox(bone19, 0, 0, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone19.cubeList.add(new ModelBox(bone19, 0, 12, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone20 = new AdvancedModelRenderer(this);
        bone20.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone19.addChild(bone20);
        bone20.cubeList.add(new ModelBox(bone20, 0, 8, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone20.cubeList.add(new ModelBox(bone20, 0, 4, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone21 = new AdvancedModelRenderer(this);
        bone21.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone20.addChild(bone21);
        bone21.cubeList.add(new ModelBox(bone21, 0, 0, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone21.cubeList.add(new ModelBox(bone21, 0, 12, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        bone22 = new AdvancedModelRenderer(this);
        bone22.setRotationPoint(0.0F, 0.0F, -2.0F);
        bone21.addChild(bone22);
        bone22.cubeList.add(new ModelBox(bone22, 0, 8, -1.0F, -1.0F, -2.5F, 2, 2, 2, 0.0F, false));
        bone22.cubeList.add(new ModelBox(bone22, 0, 4, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bone.offsetY = -3.2F;
        this.bone.offsetX = -1.138F;
        this.bone.rotateAngleY = (float)Math.toRadians(200);
        this.bone.rotateAngleX = (float)Math.toRadians(25);
        this.bone.rotateAngleZ = (float)Math.toRadians(-8);
        this.bone.scaleChildren = true;
        float scaler = 2.33F;
        this.bone.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.bone.render(f);
        //Reset rotations, positions and sizing:
        this.bone.setScale(1.0F, 1.0F, 1.0F);
        this.bone.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        //super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        AdvancedModelRenderer[] BodyF = {this.bone22,this.bone21, this.bone20,this.bone19,this.bone18,this.bone17,this.bone16,this.bone15,this.bone14,this.bone13,this.bone12};
        AdvancedModelRenderer[] BodyB = {this.bone11,this.bone10,this.bone9,this.bone8,this.bone7,this.bone6,this.bone5,this.bone4,this.bone3,this.bone2,this.bone};
        AdvancedModelRenderer[] BodyFull = {this.bone22,this.bone21, this.bone20,this.bone19,this.bone18,this.bone17,this.bone16,this.bone15,this.bone14,this.bone13,this.bone12,this.bone11,this.bone10,this.bone9,this.bone8,this.bone7,this.bone6,this.bone5,this.bone4,this.bone3,this.bone2,this.bone};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(BodyFull, 0.2F, -0.015F, -3, f2, 0.4F);
            this.chainSwing(BodyF, 0.2F, 0.08F, 3, f2, 0.5F);
            this.chainSwing(BodyB, 0.2F, -0.08F, -3, f2, 0.5F);
            EntityPrehistoricFloraPlexus ee = (EntityPrehistoricFloraPlexus) e;
            this.bone.scaleChildren = true;
            float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.08F) + 1F;
            this.bone.setScaleZ(scaler);
        }
    }
}
