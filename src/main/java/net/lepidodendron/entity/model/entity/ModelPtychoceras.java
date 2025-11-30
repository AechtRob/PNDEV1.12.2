package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPtychoceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPtychoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer mantle2;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer tentacle1;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacle10;

    private ModelAnimator animator;

    public ModelPtychoceras() {
        this.textureWidth = 54;
        this.textureHeight = 54;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -11.0F, 0.0F);
        this.base.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 17, 0, -1.5F, 0.0F, -3.0F, 3, 8, 3, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.5236F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 9, 17, -1.5F, 0.0F, -3.0F, 3, 3, 3, -0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.829F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 27, 12, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.02F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.7418F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 9, 28, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.7418F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 27, 17, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.01F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.3229F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 0, 17, -1.0F, 0.0F, -2.0F, 2, 18, 2, 0.0F, false));
        this.shell6.cubeList.add(new ModelBox(shell6, 22, 12, -0.5F, 8.5F, -2.75F, 1, 10, 1, 0.0F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.shell.addChild(mantle);
        this.mantle.cubeList.add(new ModelBox(mantle, 0, 0, -1.5F, -11.0F, -5.0F, 3, 12, 5, 0.04F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 29, 22, -1.5F, -11.0F, -6.08F, 3, 2, 1, 0.04F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 29, 26, -1.5F, -8.0F, -6.08F, 3, 2, 1, 0.04F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 30, 0, -1.5F, -5.0F, -6.08F, 3, 2, 1, 0.04F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 9, 24, -1.5F, -12.08F, -5.0F, 3, 1, 2, 0.04F, false));

        this.mantle2 = new AdvancedModelRenderer(this);
        this.mantle2.setRotationPoint(-1.0F, -11.0F, -2.0F);
        this.mantle.addChild(mantle2);
        this.setRotateAngle(mantle2, -0.6981F, 0.0F, 0.0F);
        this.mantle2.cubeList.add(new ModelBox(mantle2, 20, 24, 0.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.5F, -1.5F, 1.5F);
        this.mantle2.addChild(siphon);
        this.setRotateAngle(siphon, -0.7418F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 17, 12, 0.0F, -1.9558F, -0.3995F, 1, 2, 1, 0.0F, false));

        this.tentacle1 = new AdvancedModelRenderer(this);
        this.tentacle1.setRotationPoint(0.75F, -3.0F, 1.5F);
        this.mantle2.addChild(tentacle1);
        this.setRotateAngle(tentacle1, -0.1702F, 0.0F, -0.0611F);
        this.tentacle1.cubeList.add(new ModelBox(tentacle1, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(0.375F, -3.0F, 1.5F);
        this.mantle2.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.0873F, 0.0F, -0.2574F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.mantle2.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, 0.0F, -0.3447F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(0.375F, -3.0F, 0.5F);
        this.mantle2.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.1265F, 0.0F, -0.2531F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(0.75F, -3.0F, 0.5F);
        this.mantle2.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.2136F, 0.0093F, -0.0426F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(1.25F, -3.0F, 1.5F);
        this.mantle2.addChild(tentacle6);
        this.setRotateAngle(tentacle6, -0.1702F, 0.0F, 0.0611F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, true));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(1.625F, -3.0F, 1.5F);
        this.mantle2.addChild(tentacle7);
        this.setRotateAngle(tentacle7, -0.0873F, 0.0F, 0.2574F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, true));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(2.0F, -3.0F, 1.0F);
        this.mantle2.addChild(tentacle8);
        this.setRotateAngle(tentacle8, 0.0F, 0.0F, 0.3447F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, true));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(1.625F, -3.0F, 0.5F);
        this.mantle2.addChild(tentacle9);
        this.setRotateAngle(tentacle9, 0.1265F, 0.0F, 0.2531F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, true));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(1.25F, -3.0F, 0.5F);
        this.mantle2.addChild(tentacle10);
        this.setRotateAngle(tentacle10, 0.2136F, -0.0093F, 0.0426F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 30, 4, 0.0F, -5.0F, -0.5F, 0, 5, 1, 0.0F, true));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.base.offsetY = -0.2F;
        this.base.offsetX = -0.15F;
        this.base.offsetZ = -0.4F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.base.offsetZ = -0.1F;
        this.base.offsetY = -0.03F;
        this.base.offsetX = -0.02F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.2F;
        this.base.offsetX = 1.2F;
        this.base.rotateAngleY = (float)Math.toRadians(242);
        this.base.rotateAngleX = (float)Math.toRadians(-18);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 2.23F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPtychoceras ee = (EntityPrehistoricFloraPtychoceras) entitylivingbaseIn;

        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPtychoceras entity = (EntityPrehistoricFloraPtychoceras) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+120+50))*3), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+190+90))*4), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-240))*5));
        this.base.rotationPointX = this.base.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*2);
        this.base.rotationPointY = this.base.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+280))*0.5);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+500))*0.5);


        this.setRotateAngle(mantle2, mantle2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*5), mantle2.rotateAngleY + (float) Math.toRadians(0), mantle2.rotateAngleZ + (float) Math.toRadians(0));
        this.mantle2.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*0.03),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-0.01));


        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), siphon.rotateAngleY + (float) Math.toRadians(0), siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.1),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-0.2));


        this.setRotateAngle(tentacle1, tentacle1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+20))*5), tentacle1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), tentacle1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*4));
        this.tentacle1.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);


        this.setRotateAngle(tentacle3, tentacle3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*5), tentacle3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*2), tentacle3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-100))*4));
        this.tentacle3.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);


        this.setRotateAngle(tentacle4, tentacle4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*10), tentacle4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*2), tentacle4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*2));
        this.tentacle4.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);


        this.setRotateAngle(tentacle5, tentacle5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+460))*5), tentacle5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*2), tentacle5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-100))*4));
        this.tentacle5.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);


        this.setRotateAngle(tentacle6, tentacle6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*5), tentacle6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), tentacle6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-100))*4));
        this.tentacle6.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);


        this.setRotateAngle(tentacle7, tentacle7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*5), tentacle7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*2), tentacle7.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-100))*4));
        this.tentacle7.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);


        this.setRotateAngle(tentacle8, tentacle8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), tentacle8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*2), tentacle8.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-100))*4));
        this.tentacle8.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);


        this.setRotateAngle(tentacle9, tentacle9.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-160))*5), tentacle9.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), tentacle9.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-100))*2));
        this.tentacle9.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);


        this.setRotateAngle(tentacle10, tentacle10.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*10), tentacle10.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*2), tentacle10.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-100))*2));
        this.tentacle10.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)1);

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraPtychoceras ee = (EntityPrehistoricFloraPtychoceras) e;

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetY = 0f;
            this.base.offsetX = -0.4F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

