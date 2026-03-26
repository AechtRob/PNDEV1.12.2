package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraYilingia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelYilingia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body14;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body13;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r14;

    public ModelYilingia() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.body14 = new AdvancedModelRenderer(this);
        this.body14.setRotationPoint(0.0F, 24.0F, 4.1F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.7F, 0.0F, 0.75F);
        this.body14.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.012F, false));

        this.body13 = new AdvancedModelRenderer(this);
        this.body13.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.body14.addChild(body13);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.7F, 0.0F, 0.65F);
        this.body13.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.01F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.body13.addChild(body12);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.7F, 0.0F, 0.7F);
        this.body12.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.008F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, -0.7F);
        this.body12.addChild(body11);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.7F, 0.0F, 0.65F);
        this.body11.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.006F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, -0.75F);
        this.body11.addChild(body10);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.7F, 0.0F, 0.65F);
        this.body10.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.7854F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.004F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.body10.addChild(body9);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.7F, 0.0F, 0.7F);
        this.body9.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.002F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, -0.75F);
        this.body9.addChild(body8);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.7F, 0.0F, 0.7F);
        this.body8.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.7854F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.body8.addChild(body7);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.7F, 0.0F, 0.75F);
        this.body7.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.7854F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.002F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, -0.65F);
        this.body7.addChild(body6);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.7F, 0.0F, 0.65F);
        this.body6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.004F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.body6.addChild(body5);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.7F, 0.0F, 0.7F);
        this.body5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.7854F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.006F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.body5.addChild(body4);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.7F, 0.0F, 0.75F);
        this.body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.7854F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 5, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.008F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, -0.75F);
        this.body4.addChild(body3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.7F, 0.0F, 0.75F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.7854F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -0.75F);
        this.body3.addChild(body2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.7F, 0.0F, 0.75F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.7854F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 5, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.012F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -0.75F);
        this.body2.addChild(body1);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.7F, 0.0F, 0.75F);
        this.body1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.7854F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.014F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body14.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body14.offsetY = -3.2F;
        this.body14.offsetX = -1.6F;
        this.body14.rotateAngleY = (float)Math.toRadians(210);
        this.body14.rotateAngleX = (float)Math.toRadians(29);
        this.body14.rotateAngleZ = (float)Math.toRadians(-8);
        this.body14.scaleChildren = true;
        float scaler = 3.93F;
        this.body14.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.body2.rotateAngleY = 0.1F;
        this.body3.rotateAngleY = 0.1F;
        this.body4.rotateAngleY = 0.1F;
        this.body5.rotateAngleY = 0.1F;
        this.body6.rotateAngleY = 0.1F;
        this.body7.rotateAngleY = 0.1F;
        this.body8.rotateAngleY = 0.1F;
        this.body9.rotateAngleY = 0.1F;
        this.body10.rotateAngleY = 0.1F;
        this.body11.rotateAngleY = 0.1F;
        this.body12.rotateAngleY = 0.1F;
        this.body13.rotateAngleY = 0.1F;
        this.body14.rotateAngleY = 0.1F;

        //End of pose, now render the model:
        this.body14.render(f);
        //Reset rotations, positions and sizing:
        this.body14.setScale(1.0F, 1.0F, 1.0F);
        this.body14.scaleChildren = false;
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
        //this.body27.offsetY = 1.06F;
        this.body14.offsetZ = -0.15F;

        AdvancedModelRenderer[] BodyF = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7};
        AdvancedModelRenderer[] BodyB = {this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] BodyFull = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(BodyFull, 0.2F, -0.015F, -3, f2, 0.4F);
            this.chainSwing(BodyF, 0.2F, 0.08F, 3, f2, 0.5F);
            this.chainSwing(BodyB, 0.2F, -0.08F, -3, f2, 0.5F);
            EntityPrehistoricFloraYilingia ee = (EntityPrehistoricFloraYilingia) e;
            this.body14.scaleChildren = true;
            float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.08F) + 1F;
            this.body14.setScaleZ(scaler);
        }
    }
}
