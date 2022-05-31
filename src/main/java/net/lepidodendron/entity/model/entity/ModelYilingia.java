package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraYilingia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelYilingia extends AdvancedModelBase {
    private final AdvancedModelRenderer body27;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body26;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body25;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body24;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body23;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body22;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body21;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body20;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body19;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body18;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body17;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body16;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body15;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body14;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body13;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r27;

    public ModelYilingia() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.body27 = new AdvancedModelRenderer(this);
        this.body27.setRotationPoint(0.0F, 24.0F, 24.5F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body27.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -1.01F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body26 = new AdvancedModelRenderer(this);
        this.body26.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body27.addChild(body26);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body26.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -0.99F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body25 = new AdvancedModelRenderer(this);
        this.body25.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body26.addChild(body25);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body25.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body24 = new AdvancedModelRenderer(this);
        this.body24.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body25.addChild(body24);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body24.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -1.01F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body23 = new AdvancedModelRenderer(this);
        this.body23.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body24.addChild(body23);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body23.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, -0.99F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body22 = new AdvancedModelRenderer(this);
        this.body22.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body23.addChild(body22);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body22.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.7854F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body21 = new AdvancedModelRenderer(this);
        this.body21.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body22.addChild(body21);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body21.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.7854F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -1.01F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body20 = new AdvancedModelRenderer(this);
        this.body20.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body21.addChild(body20);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body20.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.7854F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -0.99F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body19 = new AdvancedModelRenderer(this);
        this.body19.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body20.addChild(body19);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body19.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body18 = new AdvancedModelRenderer(this);
        this.body18.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body19.addChild(body18);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body18.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, -1.01F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body17 = new AdvancedModelRenderer(this);
        this.body17.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body18.addChild(body17);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body17.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.7854F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -0.99F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body16 = new AdvancedModelRenderer(this);
        this.body16.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body17.addChild(body16);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body16.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.7854F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body15 = new AdvancedModelRenderer(this);
        this.body15.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body16.addChild(body15);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body15.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, -1.01F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body14 = new AdvancedModelRenderer(this);
        this.body14.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body15.addChild(body14);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body14.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.7854F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, -0.99F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body13 = new AdvancedModelRenderer(this);
        this.body13.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body14.addChild(body13);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body13.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.7854F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body13.addChild(body12);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body12.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.7854F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -1.01F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body12.addChild(body11);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body11.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.7854F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -0.99F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body11.addChild(body10);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body10.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.7854F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body10.addChild(body9);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body9.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.7854F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.0F, -1.01F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body9.addChild(body8);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.7854F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.0F, -0.99F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body8.addChild(body7);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body7.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.7854F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body7.addChild(body6);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body6.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.7854F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, 0.0F, -1.01F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body6.addChild(body5);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.7854F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, 0.0F, -0.99F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body5.addChild(body4);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.7854F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body4.addChild(body3);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.7854F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.0F, -1.01F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body3.addChild(body2);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.7854F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 0.0F, -0.99F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.body2.addChild(body1);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body1.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.7854F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body27.render(f5 * 0.3F);
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
        this.body27.offsetY = 1.06F;
        this.body27.offsetZ = -0.15F;

        AdvancedModelRenderer[] BodyF = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] BodyB = {this.body15, this.body16, this.body17, this.body18, this.body19, this.body20, this.body21, this.body22, this.body23, this.body24, this.body25, this.body26, this.body27};
        AdvancedModelRenderer[] BodyFull = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14, this.body15, this.body16, this.body17, this.body18, this.body19, this.body20, this.body21, this.body22, this.body23, this.body24, this.body25, this.body26, this.body27};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(BodyFull, 0.2F, -0.015F, -3, f2, 0.4F);
            this.chainSwing(BodyF, 0.2F, 0.08F, 3, f2, 0.5F);
            this.chainSwing(BodyB, 0.2F, -0.08F, -3, f2, 0.5F);
            EntityPrehistoricFloraYilingia ee = (EntityPrehistoricFloraYilingia) e;
            this.body27.scaleChildren = true;
            float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.08F) + 1F;
            this.body27.setScaleZ(scaler);
        }
    }
}
