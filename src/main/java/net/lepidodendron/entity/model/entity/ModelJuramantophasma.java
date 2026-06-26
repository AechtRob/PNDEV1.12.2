package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraJuramantophasma;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelJuramantophasma extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer antennaLeft;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer antennaRight;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legLeft3;
    private final AdvancedModelRenderer legLeft1;
    private final AdvancedModelRenderer legLeft2;
    private final AdvancedModelRenderer legRight3;
    private final AdvancedModelRenderer legRight1;
    private final AdvancedModelRenderer legRight2;

    private ModelAnimator animator;

    public ModelJuramantophasma() {
        this.textureWidth = 39;
        this.textureHeight = 46;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 20.1698F, -2.902F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.5F, 3.0F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 8, 0.0F, -0.5F, -1.1F, 2, 1, 1, 0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 16, 0.0F, -0.5F, -1.6F, 2, 1, 1, 0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 24, 0.0F, 0.1F, -2.1F, 2, 1, 3, -0.005F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 29, 0.0F, -0.4F, -2.1F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.3F, 1.0F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 19, 0.0F, -0.5F, -1.5F, 2, 1, 1, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.3F, 1.6F);
        this.root.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 5, 0.0F, -0.35F, -1.5F, 2, 1, 1, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.0F, -0.1F);
        this.root.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2793F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 5, 0.0F, -0.4F, -1.6F, 2, 1, 4, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 24, 0.0F, 0.1F, -1.6F, 2, 1, 3, -0.02F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 30, 0.0F, -0.5F, -1.6F, 2, 1, 1, 0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 11, 0.0F, -0.5F, -2.1F, 2, 1, 1, 0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.8F, 0.0547F, -1.9167F);
        this.root.addChild(head);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1355F, -0.2595F, 0.035F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 34, -0.5F, -0.5F, -0.2F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 32, -0.5F, -0.5F, -0.6F, 1, 1, 1, 0.005F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.6F, -0.4F, -1.3F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1355F, 0.2595F, -0.035F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 29, -0.5F, -0.5F, -0.2F, 1, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 30, -0.5F, -0.5F, -0.6F, 1, 1, 1, 0.005F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.2358F, 0.7809F, -1.9782F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.4828F, -0.0597F, -0.6837F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 33, 0.0F, 0.0463F, -1.0531F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.8358F, 0.7809F, -1.9782F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.4828F, 0.0597F, 0.6837F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 33, -1.0F, 0.0463F, -1.0531F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.1F, -0.4547F, -0.1833F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 16, 0.4F, 1.1F, -1.588F, 1, 1, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 29, -0.1F, -0.5F, -1.6F, 2, 2, 2, 0.0F, false));

        this.antennaLeft = new AdvancedModelRenderer(this);
        this.antennaLeft.setRotationPoint(1.1409F, -1.0471F, -1.6089F);
        this.head.addChild(antennaLeft);
        this.setRotateAngle(antennaLeft, 0.0F, 0.0F, 0.3054F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.6591F, 0.5924F, 1.4256F);
        this.antennaLeft.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3695F, 0.3272F, 0.1238F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 18, -0.2F, -5.5F, -1.6F, 0, 5, 6, 0.0F, true));

        this.antennaRight = new AdvancedModelRenderer(this);
        this.antennaRight.setRotationPoint(0.4591F, -1.0471F, -1.6089F);
        this.head.addChild(antennaRight);
        this.setRotateAngle(antennaRight, 0.0F, 0.0F, -0.3054F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.6591F, 0.5924F, 1.4256F);
        this.antennaRight.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3695F, -0.3272F, -0.1238F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 18, 0.2F, -5.5F, -1.6F, 0, 5, 6, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, 1.0556F, 3.3484F);
        this.root.addChild(abdomen);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -0.5056F, 1.6516F);
        this.abdomen.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0698F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 34, 0.5F, -0.275F, 5.3F, 1, 1, 1, 0.02F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 36, 0.5F, -0.6F, -1.7F, 1, 1, 7, 0.03F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -0.575F, -1.7F, 2, 1, 7, 0.02F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 9, 0.0F, 0.325F, -1.7F, 2, 1, 7, 0.01F, false));

        this.legLeft3 = new AdvancedModelRenderer(this);
        this.legLeft3.setRotationPoint(0.5947F, 1.475F, 1.7576F);
        this.root.addChild(legLeft3);
        this.setRotateAngle(legLeft3, 0.0F, -1.0472F, 0.0F);
        this.legLeft3.cubeList.add(new ModelBox(legLeft3, 13, 18, -0.4F, -2.7F, 0.0F, 8, 5, 0, 0.0F, true));

        this.legLeft1 = new AdvancedModelRenderer(this);
        this.legLeft1.setRotationPoint(0.5947F, 0.575F, -1.3424F);
        this.root.addChild(legLeft1);
        this.setRotateAngle(legLeft1, 0.0F, 0.6109F, 0.0F);
        this.legLeft1.cubeList.add(new ModelBox(legLeft1, 19, 11, -0.4F, -0.8F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legLeft2 = new AdvancedModelRenderer(this);
        this.legLeft2.setRotationPoint(0.6946F, 0.775F, -0.0424F);
        this.root.addChild(legLeft2);
        this.setRotateAngle(legLeft2, 0.0F, -0.1745F, 0.0F);
        this.legLeft2.cubeList.add(new ModelBox(legLeft2, 19, 0, -0.5F, -1.0F, 0.0F, 8, 4, 0, 0.0F, true));

        this.legRight3 = new AdvancedModelRenderer(this);
        this.legRight3.setRotationPoint(-0.5947F, 1.475F, 1.7576F);
        this.root.addChild(legRight3);
        this.setRotateAngle(legRight3, 0.0F, 1.0472F, 0.0F);
        this.legRight3.cubeList.add(new ModelBox(legRight3, 13, 18, -7.6F, -2.7F, 0.0F, 8, 5, 0, 0.0F, false));

        this.legRight1 = new AdvancedModelRenderer(this);
        this.legRight1.setRotationPoint(-0.5947F, 0.575F, -1.3424F);
        this.root.addChild(legRight1);
        this.setRotateAngle(legRight1, 0.0F, -0.6109F, 0.0F);
        this.legRight1.cubeList.add(new ModelBox(legRight1, 19, 11, -5.6F, -0.8F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legRight2 = new AdvancedModelRenderer(this);
        this.legRight2.setRotationPoint(-0.6946F, 0.775F, -0.0424F);
        this.root.addChild(legRight2);
        this.setRotateAngle(legRight2, 0.0F, 0.1745F, 0.0F);
        this.legRight2.cubeList.add(new ModelBox(legRight2, 19, 0, -7.5F, -1.0F, 0.0F, 8, 4, 0, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(root, 1.0F, 0.0F, 0.0F);
        this.root.offsetY = -0.25F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.root.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.30F;
        this.root.offsetX = -0.05F;
        this.root.rotateAngleY = (float)Math.toRadians(210);
        this.root.rotateAngleX = (float)Math.toRadians(40);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 3.9F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraJuramantophasma ee = (EntityPrehistoricFloraJuramantophasma) entitylivingbaseIn;

        if (ee.getIsMoving()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }



    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraJuramantophasma entity = (EntityPrehistoricFloraJuramantophasma) entitylivingbaseIn;
        int animCycle = 8;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+90))*1), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*5));


        this.setRotateAngle(antennaRight, antennaRight.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*10), antennaRight.rotateAngleY + (float) Math.toRadians(0), antennaRight.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+100))*5));


        this.setRotateAngle(antennaLeft, antennaLeft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*10), antennaLeft.rotateAngleY + (float) Math.toRadians(0), antennaLeft.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+50))*5));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (16.0129-(0)));
            yy = -5 + (((tickAnim - 0) / 2) * (-22.84145-(-5)));
            zz = 0 + (((tickAnim - 0) / 2) * (25.41377-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 16.0129 + (((tickAnim - 2) / 2) * (0-(16.0129)));
            yy = -22.84145 + (((tickAnim - 2) / 2) * (-35-(-22.84145)));
            zz = 25.41377 + (((tickAnim - 2) / 2) * (0-(25.41377)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -35 + (((tickAnim - 4) / 4) * (-5-(-35)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-11.00326-(0)));
            yy = 45 + (((tickAnim - 0) / 2) * (16.70675-(45)));
            zz = 0 + (((tickAnim - 0) / 2) * (31.77694-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -11.00326 + (((tickAnim - 2) / 2) * (0-(-11.00326)));
            yy = 16.70675 + (((tickAnim - 2) / 2) * (-17.5-(16.70675)));
            zz = 31.77694 + (((tickAnim - 2) / 2) * (0-(31.77694)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -17.5 + (((tickAnim - 4) / 4) * (45-(-17.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight1, legRight1.rotateAngleX + (float) Math.toRadians(xx), legRight1.rotateAngleY + (float) Math.toRadians(yy), legRight1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -10 + (((tickAnim - 0) / 4) * (25-(-10)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (6.88003-(0)));
            yy = 25 + (((tickAnim - 4) / 2) * (6.1299-(25)));
            zz = 0 + (((tickAnim - 4) / 2) * (23.47603-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 6.88003 + (((tickAnim - 6) / 2) * (0-(6.88003)));
            yy = 6.1299 + (((tickAnim - 6) / 2) * (-10-(6.1299)));
            zz = 23.47603 + (((tickAnim - 6) / 2) * (0-(23.47603)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 35 + (((tickAnim - 0) / 4) * (5-(35)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (16.0129-(0)));
            yy = 5 + (((tickAnim - 4) / 2) * (22.84145-(5)));
            zz = 0 + (((tickAnim - 4) / 2) * (-25.41377-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 16.0129 + (((tickAnim - 6) / 2) * (0-(16.0129)));
            yy = 22.84145 + (((tickAnim - 6) / 2) * (35-(22.84145)));
            zz = -25.41377 + (((tickAnim - 6) / 2) * (0-(-25.41377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 17.5 + (((tickAnim - 0) / 4) * (-45-(17.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-11.00326-(0)));
            yy = -45 + (((tickAnim - 4) / 2) * (-16.70675-(-45)));
            zz = 0 + (((tickAnim - 4) / 2) * (-31.77694-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -11.00326 + (((tickAnim - 6) / 2) * (0-(-11.00326)));
            yy = -16.70675 + (((tickAnim - 6) / 2) * (17.5-(-16.70675)));
            zz = -31.77694 + (((tickAnim - 6) / 2) * (0-(-31.77694)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft1, legLeft1.rotateAngleX + (float) Math.toRadians(xx), legLeft1.rotateAngleY + (float) Math.toRadians(yy), legLeft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (6.88003-(0)));
            yy = -25 + (((tickAnim - 0) / 2) * (-6.1299-(-25)));
            zz = 0 + (((tickAnim - 0) / 2) * (-23.47603-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 6.88003 + (((tickAnim - 2) / 2) * (0-(6.88003)));
            yy = -6.1299 + (((tickAnim - 2) / 2) * (10-(-6.1299)));
            zz = -23.47603 + (((tickAnim - 2) / 2) * (0-(-23.47603)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 10 + (((tickAnim - 4) / 4) * (-25-(10)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandBase e = (EntityPrehistoricFloraLandBase) entity;
        animator.update(entity);
        //N/A
    }

}
