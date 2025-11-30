package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraJuracimbrophlebia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelJuracimbrophlebia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Juracimbrophlebia;
    private final AdvancedModelRenderer abdomen1;
    private final AdvancedModelRenderer abdomen2;
    private final AdvancedModelRenderer abdomen3;
    private final AdvancedModelRenderer abdomen4;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightWings;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer leftWings;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer frontLegs;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r13;

    public ModelJuracimbrophlebia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Juracimbrophlebia = new AdvancedModelRenderer(this);
        this.Juracimbrophlebia.setRotationPoint(0.0F, 18.8F, -5.0F);


        this.abdomen1 = new AdvancedModelRenderer(this);
        this.abdomen1.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.Juracimbrophlebia.addChild(abdomen1);
        this.setRotateAngle(abdomen1, 0.0436F, 0.0F, 0.0F);
        this.abdomen1.cubeList.add(new ModelBox(abdomen1, 9, 10, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.01F, false));
        this.abdomen1.cubeList.add(new ModelBox(abdomen1, 9, 0, -0.5F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));

        this.abdomen2 = new AdvancedModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, 0.05F, 1.9F);
        this.abdomen1.addChild(abdomen2);
        this.setRotateAngle(abdomen2, -0.1047F, 0.0F, 0.0F);
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 17, 9, -1.0F, -0.25F, 0.0F, 2, 1, 3, 0.01F, false));
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 0, 7, -1.0F, 0.35F, 0.0F, 2, 1, 3, 0.0F, false));

        this.abdomen3 = new AdvancedModelRenderer(this);
        this.abdomen3.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.abdomen2.addChild(abdomen3);
        this.setRotateAngle(abdomen3, -0.2182F, 0.0F, 0.0F);
        this.abdomen3.cubeList.add(new ModelBox(abdomen3, 0, 0, -1.0F, -0.1F, 0.0F, 2, 2, 4, 0.02F, false));

        this.abdomen4 = new AdvancedModelRenderer(this);
        this.abdomen4.setRotationPoint(0.0F, 0.2F, 4.0F);
        this.abdomen3.addChild(abdomen4);
        this.setRotateAngle(abdomen4, -0.2182F, 0.0F, 0.0F);
        this.abdomen4.cubeList.add(new ModelBox(abdomen4, 4, 27, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.01F, false));
        this.abdomen4.cubeList.add(new ModelBox(abdomen4, 8, 7, -1.0F, 0.5F, 0.0F, 2, 1, 1, 0.0F, false));
        this.abdomen4.cubeList.add(new ModelBox(abdomen4, 14, 30, -0.5F, 0.0F, 1.0F, 1, 1, 1, 0.02F, false));
        this.abdomen4.cubeList.add(new ModelBox(abdomen4, 7, 30, -0.5F, 0.5F, 1.0F, 1, 1, 1, -0.01F, false));

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, -0.0433F, 0.1953F);
        this.Juracimbrophlebia.addChild(thorax);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0433F, -0.1953F);
        this.thorax.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 9, -1.0F, -1.0F, -0.8F, 2, 2, 2, 0.0F, false));

        this.rightWings = new AdvancedModelRenderer(this);
        this.rightWings.setRotationPoint(0.0F, -0.6567F, -0.1953F);
        this.thorax.addChild(rightWings);


        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-0.8F, -0.1F, -0.5F);
        this.rightWings.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 0.6764F, 1.2755F, -0.3846F);
        this.rightForewing.cubeList.add(new ModelBox(rightForewing, 17, 0, -12.7F, 0.0F, -0.5F, 13, 0, 4, 0.0F, true));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-1.0305F, 0.0F, 0.6214F);
        this.rightWings.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, 0.2134F, 1.4093F, -1.0773F);
        this.rightHindwing.cubeList.add(new ModelBox(rightHindwing, 17, 5, -12.5752F, 0.0F, -0.6556F, 13, 0, 3, 0.0F, true));

        this.leftWings = new AdvancedModelRenderer(this);
        this.leftWings.setRotationPoint(0.0F, -0.6567F, -0.1953F);
        this.thorax.addChild(leftWings);


        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(0.8F, -0.1F, -0.5F);
        this.leftWings.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 0.6764F, -1.2755F, 0.3846F);
        this.leftForewing.cubeList.add(new ModelBox(leftForewing, 17, 0, -0.3F, 0.0F, -0.5F, 13, 0, 4, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(1.0305F, 0.0F, 0.6214F);
        this.leftWings.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, 0.2134F, -1.4093F, 1.0773F);
        this.leftHindwing.cubeList.add(new ModelBox(leftHindwing, 17, 5, -0.4248F, 0.0F, -0.6556F, 13, 0, 3, 0.0F, false));

        this.frontLegs = new AdvancedModelRenderer(this);
        this.frontLegs.setRotationPoint(0.5F, 0.7433F, -0.3953F);
        this.thorax.addChild(frontLegs);


        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontLegs.addChild(leftLeg1);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.7F, 0.0F, -7.3F);
        this.leftLeg1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.7418F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 27, 4.5F, -5.5F, -7.2F, 0, 10, 13, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.frontLegs.addChild(rightLeg1);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.7F, 0.0F, -7.3F);
        this.rightLeg1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.7418F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, -4.5F, -5.5F, -7.2F, 0, 10, 13, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.7424F, 0.2433F, -0.1547F);
        this.thorax.addChild(leftLeg2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.2955F, 0.5F, 6.4261F);
        this.leftLeg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -2.3126F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 14, -3.8F, -5.5F, -7.5F, 0, 10, 13, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.9882F, 0.2433F, 0.3757F);
        this.thorax.addChild(leftLeg3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0193F, 0.5F, 5.4484F);
        this.leftLeg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -2.9671F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 2.2F, -5.5F, -10.0F, 0, 10, 16, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.7424F, 0.2433F, -0.1547F);
        this.thorax.addChild(rightLeg2);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.2955F, 0.5F, 6.4261F);
        this.rightLeg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 2.3126F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 14, 3.8F, -5.5F, -7.5F, 0, 10, 13, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.9882F, 0.2433F, 0.3757F);
        this.thorax.addChild(rightLeg3);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.0193F, 0.5F, 5.4484F);
        this.rightLeg3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 2.9671F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -2.2F, -5.5F, -10.0F, 0, 10, 16, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-1.0F, 2.3433F, -5.8953F);
        this.thorax.addChild(neck);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.5F, 4.4F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, 0.5F, -0.7F, -0.7F, 1, 1, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 7, 33, 0.5F, -2.0F, 3.3F, 1, 1, 1, 0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.4F, -1.5F, 3.7F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 27, -0.5F, -0.5F, -0.4F, 1, 1, 1, -0.05F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.6F, -1.5F, 3.7F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 27, -0.5F, -0.5F, -0.4F, 1, 1, 1, -0.05F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -0.7F, 3.8F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -1.0F, -0.7F, 0, 2, 1, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(1.2702F, -1.2237F, 3.2765F);
        this.head.addChild(leftAntenna);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0298F, -0.5763F, 0.0235F);
        this.leftAntenna.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1309F, 0.3927F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 27, 0.0F, -5.3F, -0.3F, 0, 6, 3, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(0.7298F, -1.2237F, 3.2765F);
        this.head.addChild(rightAntenna);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.0298F, -0.5763F, 0.0235F);
        this.rightAntenna.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, -0.3927F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 27, 0.0F, -5.3F, -0.3F, 0, 6, 3, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Juracimbrophlebia.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStaticSuspended(float f) {

        this.Juracimbrophlebia.render(0.01f);
    }

    public void renderStaticFloor(float f) {

        this.Juracimbrophlebia.render(0.01f);
    }

    public void renderStaticDisplayCase(float f) {
        setRotateAngle(abdomen1, 0.0436F, 0.0F, 0.0F);
        setRotateAngle(abdomen2, -0.1047F, 0.0F, 0.0F);
        setRotateAngle(abdomen3, -0.2182F, 0.0F, 0.0F);
        setRotateAngle(abdomen4, -0.2182F, 0.0F, 0.0F);
        setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        setRotateAngle(rightForewing, 0.0F, 0.2182F, 0.0F);
        setRotateAngle(rightHindwing, 0.0F, 0.9599F, 0.0F);
        setRotateAngle(leftForewing, 0.0F, -0.2182F, 0.0F);
        setRotateAngle(leftHindwing, 0.0F, -0.9599F, 0.0F);
        setRotateAngle(cube_r2, 0.0F, -0.7418F, 0.0F);
        setRotateAngle(cube_r3, 0.0F, 0.7418F, 0.0F);
        setRotateAngle(cube_r4, 0.0F, -2.3126F, 0.0F);
        setRotateAngle(cube_r5, 0.0F, -2.9671F, 0.0F);
        setRotateAngle(cube_r6, 0.0F, 2.3126F, 0.0F);
        setRotateAngle(cube_r7, 0.0F, 2.9671F, 0.0F);
        setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        setRotateAngle(cube_r9, 0.0F, 0.5236F, 0.0F);
        setRotateAngle(cube_r10, 0.0F, -0.5236F, 0.0F);
        setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        setRotateAngle(cube_r12, -0.1309F, 0.3927F, 0.0F);
        setRotateAngle(cube_r13, -0.1309F, -0.3927F, 0.0F);
        this.Juracimbrophlebia.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Juracimbrophlebia.offsetY = -1.0F;
        this.Juracimbrophlebia.offsetX = 0F;
        this.Juracimbrophlebia.rotateAngleY = (float)Math.toRadians(230);
        this.Juracimbrophlebia.rotateAngleX = (float)Math.toRadians(0);
        this.Juracimbrophlebia.rotateAngleZ = (float)Math.toRadians(0);
        this.Juracimbrophlebia.scaleChildren = true;
        float scaler = 2.23F;
        this.Juracimbrophlebia.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Juracimbrophlebia.render(f);
        //Reset rotations, positions and sizing:
        this.Juracimbrophlebia.setScale(1.0F, 1.0F, 1.0F);
        this.Juracimbrophlebia.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraJuracimbrophlebia ee = (EntityPrehistoricFloraJuracimbrophlebia) entitylivingbaseIn;


        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying
            setRotateAngle(abdomen1, 0.0436F, 0.0F, 0.0F);
            setRotateAngle(abdomen2, -0.1047F, 0.0F, 0.0F);
            setRotateAngle(abdomen3, -0.2182F, 0.0F, 0.0F);
            setRotateAngle(abdomen4, -0.2182F, 0.0F, 0.0F);
            setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
            setRotateAngle(rightForewing, 0.0F, 0.2182F, 0.0F);
            setRotateAngle(rightHindwing, 0.0F, 0.9599F, 0.0F);
            setRotateAngle(leftForewing, 0.0F, -0.2182F, 0.0F);
            setRotateAngle(leftHindwing, 0.0F, -0.9599F, 0.0F);
            setRotateAngle(cube_r2, 0.0F, -0.7418F, 0.0F);
            setRotateAngle(cube_r3, 0.0F, 0.7418F, 0.0F);
            setRotateAngle(cube_r4, 0.0F, -2.3126F, 0.0F);
            setRotateAngle(cube_r5, 0.0F, -2.9671F, 0.0F);
            setRotateAngle(cube_r6, 0.0F, 2.3126F, 0.0F);
            setRotateAngle(cube_r7, 0.0F, 2.9671F, 0.0F);
            setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
            setRotateAngle(cube_r9, 0.0F, 0.5236F, 0.0F);
            setRotateAngle(cube_r10, 0.0F, -0.5236F, 0.0F);
            setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
            setRotateAngle(cube_r12, -0.1309F, 0.3927F, 0.0F);
            setRotateAngle(cube_r13, -0.1309F, -0.3927F, 0.0F);
        }

    }

    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraJuracimbrophlebia entity = (EntityPrehistoricFloraJuracimbrophlebia) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Juracimbrophlebia, Juracimbrophlebia.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*4, Juracimbrophlebia.rotateAngleY + (float) Math.toRadians(0), Juracimbrophlebia.rotateAngleZ + (float) Math.toRadians(0));
//        this.Juracimbrophlebia.rotationPointX = this.Juracimbrophlebia.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*1);
//        this.Juracimbrophlebia.rotationPointY = this.Juracimbrophlebia.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*0.8);
//        this.Juracimbrophlebia.rotationPointZ = this.Juracimbrophlebia.rotationPointZ + (float)(0);


        this.setRotateAngle(abdomen2, abdomen2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+50))*5), abdomen2.rotateAngleY + (float) Math.toRadians(0), abdomen2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -42.86894 + (((tickAnim - 0) / 1) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 0) / 1) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 0) / 1) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -11.28076 + (((tickAnim - 1) / 1) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 1) / 1) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 1) / 1) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -58.54322 + (((tickAnim - 2) / 0) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 2) / 0) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 2) / 0) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -68.14274 + (((tickAnim - 2) / 1) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 2) / 1) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 2) / 1) * (97.99836-(54.44711)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -42.86894 + (((tickAnim - 3) / 1) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 3) / 1) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 3) / 1) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -11.28076 + (((tickAnim - 4) / 1) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 4) / 1) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 4) / 1) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -58.54322 + (((tickAnim - 5) / 1) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 5) / 1) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 5) / 1) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -68.14274 + (((tickAnim - 6) / 0) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 6) / 0) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 6) / 0) * (97.99836-(54.44711)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -42.86894 + (((tickAnim - 6) / 1) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 6) / 1) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 6) / 1) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -11.28076 + (((tickAnim - 7) / 1) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 7) / 1) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 7) / 1) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -58.54322 + (((tickAnim - 8) / 1) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 8) / 1) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 8) / 1) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -68.14274 + (((tickAnim - 9) / 1) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 9) / 1) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 9) / 1) * (97.99836-(54.44711)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -42.86894 + (((tickAnim - 10) / 0) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 10) / 0) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 10) / 0) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -11.28076 + (((tickAnim - 10) / 1) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 10) / 1) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 10) / 1) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -58.54322 + (((tickAnim - 11) / 1) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 11) / 1) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 11) / 1) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -68.14274 + (((tickAnim - 12) / 1) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 12) / 1) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 12) / 1) * (97.99836-(54.44711)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -42.86894 + (((tickAnim - 13) / 1) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 13) / 1) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 13) / 1) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = -11.28076 + (((tickAnim - 14) / 0) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 14) / 0) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 14) / 0) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -58.54322 + (((tickAnim - 14) / 1) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 14) / 1) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 14) / 1) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -68.14274 + (((tickAnim - 15) / 1) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 15) / 1) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 15) / 1) * (97.99836-(54.44711)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -42.86894 + (((tickAnim - 16) / 1) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 16) / 1) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 16) / 1) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -11.28076 + (((tickAnim - 17) / 1) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 17) / 1) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 17) / 1) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -58.54322 + (((tickAnim - 18) / 0) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 18) / 0) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 18) / 0) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -68.14274 + (((tickAnim - 18) / 1) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 18) / 1) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 18) / 1) * (97.99836-(54.44711)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -42.86894 + (((tickAnim - 19) / 1) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 19) / 1) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 19) / 1) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -11.28076 + (((tickAnim - 20) / 1) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 20) / 1) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 20) / 1) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -58.54322 + (((tickAnim - 21) / 1) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 21) / 1) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 21) / 1) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -68.14274 + (((tickAnim - 22) / 0) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 22) / 0) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 22) / 0) * (97.99836-(54.44711)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -42.86894 + (((tickAnim - 22) / 1) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 22) / 1) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 22) / 1) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -11.28076 + (((tickAnim - 23) / 1) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 23) / 1) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 23) / 1) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -58.54322 + (((tickAnim - 24) / 1) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 24) / 1) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 24) / 1) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -68.14274 + (((tickAnim - 25) / 1) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 25) / 1) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 25) / 1) * (97.99836-(54.44711)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -42.86894 + (((tickAnim - 26) / 0) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 26) / 0) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 26) / 0) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = -11.28076 + (((tickAnim - 26) / 1) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 26) / 1) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 26) / 1) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -58.54322 + (((tickAnim - 27) / 1) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 27) / 1) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 27) / 1) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -68.14274 + (((tickAnim - 28) / 1) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 28) / 1) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 28) / 1) * (97.99836-(54.44711)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -42.86894 + (((tickAnim - 29) / 1) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 29) / 1) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 29) / 1) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = -11.28076 + (((tickAnim - 30) / 0) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 30) / 0) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 30) / 0) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -58.54322 + (((tickAnim - 30) / 1) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 30) / 1) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 30) / 1) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -68.14274 + (((tickAnim - 31) / 1) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 31) / 1) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 31) / 1) * (97.99836-(54.44711)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -42.86894 + (((tickAnim - 32) / 1) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 32) / 1) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 32) / 1) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -11.28076 + (((tickAnim - 33) / 1) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 33) / 1) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 33) / 1) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -58.54322 + (((tickAnim - 34) / 0) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 34) / 0) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 34) / 0) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -68.14274 + (((tickAnim - 34) / 1) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 34) / 1) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 34) / 1) * (97.99836-(54.44711)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -42.86894 + (((tickAnim - 35) / 1) * (-11.28076-(-42.86894)));
            yy = -67.35337 + (((tickAnim - 35) / 1) * (-71.40035-(-67.35337)));
            zz = 97.99836 + (((tickAnim - 35) / 1) * (24.94493-(97.99836)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = -11.28076 + (((tickAnim - 36) / 1) * (-58.54322-(-11.28076)));
            yy = -71.40035 + (((tickAnim - 36) / 1) * (-80.01317-(-71.40035)));
            zz = 24.94493 + (((tickAnim - 36) / 1) * (-30.17075-(24.94493)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -58.54322 + (((tickAnim - 37) / 1) * (-68.14274-(-58.54322)));
            yy = -80.01317 + (((tickAnim - 37) / 1) * (-62.02557-(-80.01317)));
            zz = -30.17075 + (((tickAnim - 37) / 1) * (54.44711-(-30.17075)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -68.14274 + (((tickAnim - 38) / 0) * (-42.86894-(-68.14274)));
            yy = -62.02557 + (((tickAnim - 38) / 0) * (-67.35337-(-62.02557)));
            zz = 54.44711 + (((tickAnim - 38) / 0) * (97.99836-(54.44711)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -13.21293 + (((tickAnim - 0) / 1) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 0) / 1) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 0) / 1) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 26.46483 + (((tickAnim - 1) / 1) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 1) / 1) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 1) / 1) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -13.85742 + (((tickAnim - 2) / 0) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 2) / 0) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 2) / 0) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -68.01546 + (((tickAnim - 2) / 1) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 2) / 1) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 2) / 1) * (134.98617-(54.13611)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -13.21293 + (((tickAnim - 3) / 1) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 3) / 1) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 3) / 1) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 26.46483 + (((tickAnim - 4) / 1) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 4) / 1) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 4) / 1) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -13.85742 + (((tickAnim - 5) / 1) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 5) / 1) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 5) / 1) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -68.01546 + (((tickAnim - 6) / 0) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 6) / 0) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 6) / 0) * (134.98617-(54.13611)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -13.21293 + (((tickAnim - 6) / 1) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 6) / 1) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 6) / 1) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 26.46483 + (((tickAnim - 7) / 1) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 7) / 1) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 7) / 1) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -13.85742 + (((tickAnim - 8) / 1) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 8) / 1) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 8) / 1) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -68.01546 + (((tickAnim - 9) / 1) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 9) / 1) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 9) / 1) * (134.98617-(54.13611)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -13.21293 + (((tickAnim - 10) / 0) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 10) / 0) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 10) / 0) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 26.46483 + (((tickAnim - 10) / 1) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 10) / 1) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 10) / 1) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -13.85742 + (((tickAnim - 11) / 1) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 11) / 1) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 11) / 1) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -68.01546 + (((tickAnim - 12) / 1) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 12) / 1) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 12) / 1) * (134.98617-(54.13611)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -13.21293 + (((tickAnim - 13) / 1) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 13) / 1) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 13) / 1) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 26.46483 + (((tickAnim - 14) / 0) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 14) / 0) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 14) / 0) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -13.85742 + (((tickAnim - 14) / 1) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 14) / 1) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 14) / 1) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -68.01546 + (((tickAnim - 15) / 1) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 15) / 1) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 15) / 1) * (134.98617-(54.13611)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -13.21293 + (((tickAnim - 16) / 1) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 16) / 1) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 16) / 1) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 26.46483 + (((tickAnim - 17) / 1) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 17) / 1) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 17) / 1) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -13.85742 + (((tickAnim - 18) / 0) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 18) / 0) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 18) / 0) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -68.01546 + (((tickAnim - 18) / 1) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 18) / 1) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 18) / 1) * (134.98617-(54.13611)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -13.21293 + (((tickAnim - 19) / 1) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 19) / 1) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 19) / 1) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 26.46483 + (((tickAnim - 20) / 1) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 20) / 1) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 20) / 1) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -13.85742 + (((tickAnim - 21) / 1) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 21) / 1) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 21) / 1) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -68.01546 + (((tickAnim - 22) / 0) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 22) / 0) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 22) / 0) * (134.98617-(54.13611)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -13.21293 + (((tickAnim - 22) / 1) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 22) / 1) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 22) / 1) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 26.46483 + (((tickAnim - 23) / 1) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 23) / 1) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 23) / 1) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -13.85742 + (((tickAnim - 24) / 1) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 24) / 1) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 24) / 1) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -68.01546 + (((tickAnim - 25) / 1) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 25) / 1) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 25) / 1) * (134.98617-(54.13611)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -13.21293 + (((tickAnim - 26) / 0) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 26) / 0) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 26) / 0) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 26.46483 + (((tickAnim - 26) / 1) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 26) / 1) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 26) / 1) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -13.85742 + (((tickAnim - 27) / 1) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 27) / 1) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 27) / 1) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -68.01546 + (((tickAnim - 28) / 1) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 28) / 1) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 28) / 1) * (134.98617-(54.13611)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -13.21293 + (((tickAnim - 29) / 1) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 29) / 1) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 29) / 1) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 26.46483 + (((tickAnim - 30) / 0) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 30) / 0) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 30) / 0) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -13.85742 + (((tickAnim - 30) / 1) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 30) / 1) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 30) / 1) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -68.01546 + (((tickAnim - 31) / 1) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 31) / 1) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 31) / 1) * (134.98617-(54.13611)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -13.21293 + (((tickAnim - 32) / 1) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 32) / 1) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 32) / 1) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 26.46483 + (((tickAnim - 33) / 1) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 33) / 1) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 33) / 1) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -13.85742 + (((tickAnim - 34) / 0) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 34) / 0) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 34) / 0) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -68.01546 + (((tickAnim - 34) / 1) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 34) / 1) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 34) / 1) * (134.98617-(54.13611)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -13.21293 + (((tickAnim - 35) / 1) * (26.46483-(-13.21293)));
            yy = -52.049 + (((tickAnim - 35) / 1) * (-52.19867-(-52.049)));
            zz = 134.98617 + (((tickAnim - 35) / 1) * (68.53213-(134.98617)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 26.46483 + (((tickAnim - 36) / 1) * (-13.85742-(26.46483)));
            yy = -52.19867 + (((tickAnim - 36) / 1) * (-52.34834-(-52.19867)));
            zz = 68.53213 + (((tickAnim - 36) / 1) * (2.0781-(68.53213)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -13.85742 + (((tickAnim - 37) / 1) * (-68.01546-(-13.85742)));
            yy = -52.34834 + (((tickAnim - 37) / 1) * (-53.72769-(-52.34834)));
            zz = 2.0781 + (((tickAnim - 37) / 1) * (54.13611-(2.0781)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -68.01546 + (((tickAnim - 38) / 0) * (-13.21293-(-68.01546)));
            yy = -53.72769 + (((tickAnim - 38) / 0) * (-52.049-(-53.72769)));
            zz = 54.13611 + (((tickAnim - 38) / 0) * (134.98617-(54.13611)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -42.86894 + (((tickAnim - 0) / 1) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 0) / 1) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 0) / 1) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -11.28076 + (((tickAnim - 1) / 1) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 1) / 1) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 1) / 1) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -58.54322 + (((tickAnim - 2) / 0) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 2) / 0) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 2) / 0) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -68.14274 + (((tickAnim - 2) / 1) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 2) / 1) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 2) / 1) * (-97.99836-(-54.44711)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -42.86894 + (((tickAnim - 3) / 1) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 3) / 1) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 3) / 1) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -11.28076 + (((tickAnim - 4) / 1) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 4) / 1) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 4) / 1) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -58.54322 + (((tickAnim - 5) / 1) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 5) / 1) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 5) / 1) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -68.14274 + (((tickAnim - 6) / 0) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 6) / 0) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 6) / 0) * (-97.99836-(-54.44711)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -42.86894 + (((tickAnim - 6) / 1) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 6) / 1) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 6) / 1) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -11.28076 + (((tickAnim - 7) / 1) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 7) / 1) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 7) / 1) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -58.54322 + (((tickAnim - 8) / 1) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 8) / 1) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 8) / 1) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -68.14274 + (((tickAnim - 9) / 1) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 9) / 1) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 9) / 1) * (-97.99836-(-54.44711)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -42.86894 + (((tickAnim - 10) / 0) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 10) / 0) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 10) / 0) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -11.28076 + (((tickAnim - 10) / 1) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 10) / 1) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 10) / 1) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -58.54322 + (((tickAnim - 11) / 1) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 11) / 1) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 11) / 1) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -68.14274 + (((tickAnim - 12) / 1) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 12) / 1) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 12) / 1) * (-97.99836-(-54.44711)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -42.86894 + (((tickAnim - 13) / 1) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 13) / 1) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 13) / 1) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = -11.28076 + (((tickAnim - 14) / 0) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 14) / 0) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 14) / 0) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -58.54322 + (((tickAnim - 14) / 1) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 14) / 1) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 14) / 1) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -68.14274 + (((tickAnim - 15) / 1) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 15) / 1) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 15) / 1) * (-97.99836-(-54.44711)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -42.86894 + (((tickAnim - 16) / 1) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 16) / 1) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 16) / 1) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -11.28076 + (((tickAnim - 17) / 1) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 17) / 1) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 17) / 1) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -58.54322 + (((tickAnim - 18) / 0) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 18) / 0) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 18) / 0) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -68.14274 + (((tickAnim - 18) / 1) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 18) / 1) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 18) / 1) * (-97.99836-(-54.44711)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -42.86894 + (((tickAnim - 19) / 1) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 19) / 1) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 19) / 1) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -11.28076 + (((tickAnim - 20) / 1) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 20) / 1) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 20) / 1) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -58.54322 + (((tickAnim - 21) / 1) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 21) / 1) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 21) / 1) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -68.14274 + (((tickAnim - 22) / 0) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 22) / 0) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 22) / 0) * (-97.99836-(-54.44711)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -42.86894 + (((tickAnim - 22) / 1) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 22) / 1) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 22) / 1) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -11.28076 + (((tickAnim - 23) / 1) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 23) / 1) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 23) / 1) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -58.54322 + (((tickAnim - 24) / 1) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 24) / 1) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 24) / 1) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -68.14274 + (((tickAnim - 25) / 1) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 25) / 1) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 25) / 1) * (-97.99836-(-54.44711)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -42.86894 + (((tickAnim - 26) / 0) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 26) / 0) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 26) / 0) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = -11.28076 + (((tickAnim - 26) / 1) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 26) / 1) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 26) / 1) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -58.54322 + (((tickAnim - 27) / 1) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 27) / 1) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 27) / 1) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -68.14274 + (((tickAnim - 28) / 1) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 28) / 1) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 28) / 1) * (-97.99836-(-54.44711)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -42.86894 + (((tickAnim - 29) / 1) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 29) / 1) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 29) / 1) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = -11.28076 + (((tickAnim - 30) / 0) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 30) / 0) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 30) / 0) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -58.54322 + (((tickAnim - 30) / 1) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 30) / 1) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 30) / 1) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -68.14274 + (((tickAnim - 31) / 1) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 31) / 1) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 31) / 1) * (-97.99836-(-54.44711)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -42.86894 + (((tickAnim - 32) / 1) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 32) / 1) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 32) / 1) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -11.28076 + (((tickAnim - 33) / 1) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 33) / 1) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 33) / 1) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -58.54322 + (((tickAnim - 34) / 0) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 34) / 0) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 34) / 0) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -68.14274 + (((tickAnim - 34) / 1) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 34) / 1) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 34) / 1) * (-97.99836-(-54.44711)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -42.86894 + (((tickAnim - 35) / 1) * (-11.28076-(-42.86894)));
            yy = 67.35337 + (((tickAnim - 35) / 1) * (71.40035-(67.35337)));
            zz = -97.99836 + (((tickAnim - 35) / 1) * (-24.94493-(-97.99836)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = -11.28076 + (((tickAnim - 36) / 1) * (-58.54322-(-11.28076)));
            yy = 71.40035 + (((tickAnim - 36) / 1) * (80.01317-(71.40035)));
            zz = -24.94493 + (((tickAnim - 36) / 1) * (30.17075-(-24.94493)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -58.54322 + (((tickAnim - 37) / 1) * (-68.14274-(-58.54322)));
            yy = 80.01317 + (((tickAnim - 37) / 1) * (62.02557-(80.01317)));
            zz = 30.17075 + (((tickAnim - 37) / 1) * (-54.44711-(30.17075)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -68.14274 + (((tickAnim - 38) / 0) * (-42.86894-(-68.14274)));
            yy = 62.02557 + (((tickAnim - 38) / 0) * (67.35337-(62.02557)));
            zz = -54.44711 + (((tickAnim - 38) / 0) * (-97.99836-(-54.44711)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -13.21293 + (((tickAnim - 0) / 1) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 0) / 1) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 0) / 1) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 26.46483 + (((tickAnim - 1) / 1) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 1) / 1) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 1) / 1) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -13.85742 + (((tickAnim - 2) / 0) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 2) / 0) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 2) / 0) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -68.01546 + (((tickAnim - 2) / 1) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 2) / 1) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 2) / 1) * (-134.98617-(-54.13611)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -13.21293 + (((tickAnim - 3) / 1) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 3) / 1) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 3) / 1) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 26.46483 + (((tickAnim - 4) / 1) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 4) / 1) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 4) / 1) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -13.85742 + (((tickAnim - 5) / 1) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 5) / 1) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 5) / 1) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -68.01546 + (((tickAnim - 6) / 0) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 6) / 0) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 6) / 0) * (-134.98617-(-54.13611)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -13.21293 + (((tickAnim - 6) / 1) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 6) / 1) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 6) / 1) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 26.46483 + (((tickAnim - 7) / 1) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 7) / 1) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 7) / 1) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -13.85742 + (((tickAnim - 8) / 1) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 8) / 1) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 8) / 1) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -68.01546 + (((tickAnim - 9) / 1) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 9) / 1) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 9) / 1) * (-134.98617-(-54.13611)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -13.21293 + (((tickAnim - 10) / 0) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 10) / 0) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 10) / 0) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 26.46483 + (((tickAnim - 10) / 1) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 10) / 1) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 10) / 1) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -13.85742 + (((tickAnim - 11) / 1) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 11) / 1) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 11) / 1) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -68.01546 + (((tickAnim - 12) / 1) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 12) / 1) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 12) / 1) * (-134.98617-(-54.13611)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -13.21293 + (((tickAnim - 13) / 1) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 13) / 1) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 13) / 1) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 26.46483 + (((tickAnim - 14) / 0) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 14) / 0) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 14) / 0) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -13.85742 + (((tickAnim - 14) / 1) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 14) / 1) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 14) / 1) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -68.01546 + (((tickAnim - 15) / 1) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 15) / 1) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 15) / 1) * (-134.98617-(-54.13611)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -13.21293 + (((tickAnim - 16) / 1) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 16) / 1) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 16) / 1) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 26.46483 + (((tickAnim - 17) / 1) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 17) / 1) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 17) / 1) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -13.85742 + (((tickAnim - 18) / 0) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 18) / 0) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 18) / 0) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -68.01546 + (((tickAnim - 18) / 1) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 18) / 1) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 18) / 1) * (-134.98617-(-54.13611)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -13.21293 + (((tickAnim - 19) / 1) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 19) / 1) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 19) / 1) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 26.46483 + (((tickAnim - 20) / 1) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 20) / 1) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 20) / 1) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -13.85742 + (((tickAnim - 21) / 1) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 21) / 1) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 21) / 1) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -68.01546 + (((tickAnim - 22) / 0) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 22) / 0) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 22) / 0) * (-134.98617-(-54.13611)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -13.21293 + (((tickAnim - 22) / 1) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 22) / 1) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 22) / 1) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 26.46483 + (((tickAnim - 23) / 1) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 23) / 1) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 23) / 1) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -13.85742 + (((tickAnim - 24) / 1) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 24) / 1) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 24) / 1) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -68.01546 + (((tickAnim - 25) / 1) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 25) / 1) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 25) / 1) * (-134.98617-(-54.13611)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -13.21293 + (((tickAnim - 26) / 0) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 26) / 0) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 26) / 0) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 26.46483 + (((tickAnim - 26) / 1) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 26) / 1) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 26) / 1) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -13.85742 + (((tickAnim - 27) / 1) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 27) / 1) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 27) / 1) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -68.01546 + (((tickAnim - 28) / 1) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 28) / 1) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 28) / 1) * (-134.98617-(-54.13611)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -13.21293 + (((tickAnim - 29) / 1) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 29) / 1) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 29) / 1) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 26.46483 + (((tickAnim - 30) / 0) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 30) / 0) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 30) / 0) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -13.85742 + (((tickAnim - 30) / 1) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 30) / 1) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 30) / 1) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -68.01546 + (((tickAnim - 31) / 1) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 31) / 1) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 31) / 1) * (-134.98617-(-54.13611)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -13.21293 + (((tickAnim - 32) / 1) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 32) / 1) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 32) / 1) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 26.46483 + (((tickAnim - 33) / 1) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 33) / 1) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 33) / 1) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -13.85742 + (((tickAnim - 34) / 0) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 34) / 0) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 34) / 0) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -68.01546 + (((tickAnim - 34) / 1) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 34) / 1) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 34) / 1) * (-134.98617-(-54.13611)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -13.21293 + (((tickAnim - 35) / 1) * (26.46483-(-13.21293)));
            yy = 52.049 + (((tickAnim - 35) / 1) * (52.19867-(52.049)));
            zz = -134.98617 + (((tickAnim - 35) / 1) * (-68.53213-(-134.98617)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 26.46483 + (((tickAnim - 36) / 1) * (-13.85742-(26.46483)));
            yy = 52.19867 + (((tickAnim - 36) / 1) * (52.34834-(52.19867)));
            zz = -68.53213 + (((tickAnim - 36) / 1) * (-2.0781-(-68.53213)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -13.85742 + (((tickAnim - 37) / 1) * (-68.01546-(-13.85742)));
            yy = 52.34834 + (((tickAnim - 37) / 1) * (53.72769-(52.34834)));
            zz = -2.0781 + (((tickAnim - 37) / 1) * (-54.13611-(-2.0781)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -68.01546 + (((tickAnim - 38) / 0) * (-13.21293-(-68.01546)));
            yy = 53.72769 + (((tickAnim - 38) / 0) * (52.049-(53.72769)));
            zz = -54.13611 + (((tickAnim - 38) / 0) * (-134.98617-(-54.13611)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+20))*10, leftLeg1.rotateAngleY + (float) Math.toRadians(-0), leftLeg1.rotateAngleZ + (float) Math.toRadians(-13.0031));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + ((float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*10), rightLeg1.rotateAngleY + (float) Math.toRadians(0), rightLeg1.rotateAngleZ + (float) Math.toRadians(13.0031));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*6, leftLeg2.rotateAngleY + (float) Math.toRadians(-31.33104), leftLeg2.rotateAngleZ + (float) Math.toRadians(0.15482));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+100))*6, leftLeg3.rotateAngleY + (float) Math.toRadians(-7.5), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+30))*6, rightLeg2.rotateAngleY + (float) Math.toRadians(31.33104), rightLeg2.rotateAngleZ + (float) Math.toRadians(-0.15482));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+120))*6, rightLeg3.rotateAngleY + (float) Math.toRadians(7.5), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));
    }
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);


    }
}
