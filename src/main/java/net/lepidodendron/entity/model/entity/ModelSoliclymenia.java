package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSoliclymenia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSoliclymenia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer shell1;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer shell9;
    private final AdvancedModelRenderer shell10;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle6b;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle7b;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle5b;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle3b;

    private ModelAnimator animator;

    public ModelSoliclymenia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 9.0F, -4.0F);


        this.shell1 = new AdvancedModelRenderer(this);
        this.shell1.setRotationPoint(0.0F, 12.0F, 9.0F);
        this.root.addChild(shell1);
        this.setRotateAngle(shell1, 0.2182F, 0.0F, 0.0F);
        this.shell1.cubeList.add(new ModelBox(shell1, 0, 31, -2.0F, -2.0F, -10.0F, 4, 2, 10, 0.05F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.shell1.addChild(shell2);
        this.setRotateAngle(shell2, -0.6109F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 42, 31, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.04F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.6545F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 36, 21, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.03F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.7854F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 17, 18, -2.0F, -2.0F, -11.0F, 4, 2, 11, 0.02F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.5672F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 36, 16, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.01F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.829F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 0, 6, -1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.7854F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 19, 3, -1.5F, -2.0F, -11.0F, 3, 2, 11, -0.01F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.6981F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 16, 16, -1.5F, -2.0F, -2.0F, 3, 2, 2, -0.02F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, -0.6981F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 0, 14, -1.5F, -2.0F, -2.0F, 3, 2, 2, -0.03F, false));

        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.shell9.addChild(shell10);
        this.setRotateAngle(shell10, -0.6545F, 0.0F, 0.0F);
        this.shell10.cubeList.add(new ModelBox(shell10, 0, 0, -1.5F, -2.0F, -12.0F, 3, 2, 12, -0.04F, false));
        this.shell10.cubeList.add(new ModelBox(shell10, 28, 31, -1.0F, -6.75F, -11.0F, 2, 2, 10, 0.0F, false));
        this.shell10.cubeList.add(new ModelBox(shell10, 18, 31, -1.0F, -8.75F, -10.0F, 2, 2, 8, 0.0F, false));
        this.shell10.cubeList.add(new ModelBox(shell10, 36, 0, -1.0F, -10.75F, -9.0F, 2, 2, 6, 0.0F, false));
        this.shell10.cubeList.add(new ModelBox(shell10, 0, 0, -1.0F, -12.75F, -7.075F, 2, 2, 4, 0.0F, false));
        this.shell10.cubeList.add(new ModelBox(shell10, 0, 14, -1.0F, -4.75F, -12.0F, 2, 3, 12, 0.0F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 11.1F, 8.1F);
        this.root.addChild(mantle);
        this.setRotateAngle(mantle, 0.1222F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 36, 8, -2.0F, -0.996F, 0.4165F, 4, 2, 3, 0.0F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 0, 2, 1.75F, -0.746F, 0.9165F, 1, 1, 1, 0.0F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 0, 0, -2.75F, -0.746F, 0.9165F, 1, 1, 1, 0.0F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, 0.379F, 0.9165F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.3927F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 23, 0, -1.0F, -0.5F, 0.5F, 2, 1, 2, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(0.5F, 0.504F, 3.4165F);
        this.mantle.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, -0.3927F, 0.0126F, -0.0034F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 0, 22, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, 0.2793F, -0.0042F, -0.0012F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-0.5F, 0.504F, 3.4165F);
        this.mantle.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, -0.3927F, -0.0126F, 0.0034F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 0, 22, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, 0.2793F, 0.0042F, 0.0012F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(1.5F, 0.504F, 3.4165F);
        this.mantle.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, -0.2009F, 0.0564F, -0.0064F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 18, 31, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, 0.0873F, -0.0435F, -0.0038F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 0, 29, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-1.5F, 0.504F, 3.4165F);
        this.mantle.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, -0.2009F, -0.0564F, 0.0064F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 18, 31, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, 0.0873F, 0.0435F, 0.0038F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 0, 29, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(1.5F, -0.496F, 3.4165F);
        this.mantle.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, 0.1308F, 0.0435F, -0.0038F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 18, 0, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.1308F, -0.0435F, -0.0038F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 0, 18, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-1.5F, -0.496F, 3.4165F);
        this.mantle.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, 0.1308F, -0.0435F, 0.0038F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 18, 0, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.1308F, 0.0435F, 0.0038F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 0, 18, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(0.5F, -0.496F, 3.4165F);
        this.mantle.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, 0.0916F, 0.0216F, -0.0028F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 18, 8, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.013F, -0.0344F, -0.0061F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 18, 4, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-0.5F, -0.496F, 3.4165F);
        this.mantle.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, 0.0916F, -0.0216F, 0.0028F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 18, 8, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, -0.0261F, 0.0344F, 0.0061F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 18, 4, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(1.5F, 0.004F, 3.4165F);
        this.mantle.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, -0.1302F, 0.238F, -0.0309F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 18, 8, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, 0.1746F, -0.0344F, -0.0061F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 18, 4, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-1.5F, 0.004F, 3.4165F);
        this.mantle.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, -0.1302F, -0.238F, 0.0309F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 18, 8, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, 0.1746F, 0.0344F, 0.0061F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 18, 4, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.15F;
        this.root.offsetZ = -0.4F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetZ = -0.1F;
        this.root.offsetY = -0.03F;
        this.root.offsetX = -0.02F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -3.8F;
        this.root.offsetX = 1.2F;
        this.root.rotateAngleY = (float)Math.toRadians(272);
        this.root.rotateAngleX = (float)Math.toRadians(-18);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 3.23F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        EntityPrehistoricFloraSoliclymenia ee = (EntityPrehistoricFloraSoliclymenia) entitylivingbaseIn;

        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSoliclymenia entity = (EntityPrehistoricFloraSoliclymenia) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4+15))*1.25), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(0));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4-30))*-0.25);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4))*0.18);


        this.setRotateAngle(mantle, mantle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4-80))*1.4), mantle.rotateAngleY + (float) Math.toRadians(0), mantle.rotateAngleZ + (float) Math.toRadians(0));
        this.mantle.rotationPointX = this.mantle.rotationPointX + (float)(0);
        this.mantle.rotationPointY = this.mantle.rotationPointY - (float)(0);
        this.mantle.rotationPointZ = this.mantle.rotationPointZ + (float)(0);
        this.mantle.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4))*0.015));


        this.siphon.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4))*0.05));


        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4-50))*-0.8), Tentacle6a.rotateAngleY + (float) Math.toRadians(0), Tentacle6a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(0), Tentacle6b.rotateAngleY + (float) Math.toRadians(0), Tentacle6b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4-50))*-0.8), Tentacle1a.rotateAngleY + (float) Math.toRadians(0), Tentacle1a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(0), Tentacle1b.rotateAngleY + (float) Math.toRadians(0), Tentacle1b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4-40))*-0.5), Tentacle7a.rotateAngleY + (float) Math.toRadians(0), Tentacle7a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(0), Tentacle7b.rotateAngleY + (float) Math.toRadians(0), Tentacle7b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4-30))*-0.5), Tentacle2a.rotateAngleY + (float) Math.toRadians(0), Tentacle2a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(0), Tentacle2b.rotateAngleY + (float) Math.toRadians(0), Tentacle2b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(-6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4))*0.5), Tentacle9a.rotateAngleY + (float) Math.toRadians(0), Tentacle9a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(0), Tentacle9b.rotateAngleY + (float) Math.toRadians(0), Tentacle9b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(-6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4))*0.5), Tentacle4a.rotateAngleY + (float) Math.toRadians(0), Tentacle4a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(0), Tentacle4b.rotateAngleY + (float) Math.toRadians(0), Tentacle4b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(-6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4-50))*0.5), Tentacle10a.rotateAngleY + (float) Math.toRadians(0), Tentacle10a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(0), Tentacle10b.rotateAngleY + (float) Math.toRadians(0), Tentacle10b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(-6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.4-45))*0.5), Tentacle5a.rotateAngleY + (float) Math.toRadians(0), Tentacle5a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(0), Tentacle5b.rotateAngleY + (float) Math.toRadians(0), Tentacle5b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(-3.25), Tentacle8a.rotateAngleY + (float) Math.toRadians(-7.75), Tentacle8a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(0), Tentacle8b.rotateAngleY + (float) Math.toRadians(0), Tentacle8b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(-3.25), Tentacle3a.rotateAngleY + (float) Math.toRadians(7.75), Tentacle3a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(0), Tentacle3b.rotateAngleY + (float) Math.toRadians(0), Tentacle3b.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraSoliclymenia ee = (EntityPrehistoricFloraSoliclymenia) e;

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = 0.8f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

