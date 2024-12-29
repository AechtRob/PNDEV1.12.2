package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBrannerion extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer dorsalslopetailend;
    private final AdvancedModelRenderer tailendunderslope;
    private final AdvancedModelRenderer dorsalslopetailbase;
    private final AdvancedModelRenderer tailbaseunderslope;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer dorsalslopebodyend;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer bellyslopebodyend;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer dorsalslopemiddle;
    private final AdvancedModelRenderer bellyslopefront;
    private final AdvancedModelRenderer dorsalslopefront;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headslope;
    private final AdvancedModelRenderer eyeportion;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer leftupperlip;
    private final AdvancedModelRenderer rightupperlip;
    private final AdvancedModelRenderer lefteyepupil;
    private final AdvancedModelRenderer lefteyewhite1;
    private final AdvancedModelRenderer lefteyewhite2;
    private final AdvancedModelRenderer lefteyewhite3;
    private final AdvancedModelRenderer lefteyewhite4;
    private final AdvancedModelRenderer righteyepupil;
    private final AdvancedModelRenderer righteyewhite1;
    private final AdvancedModelRenderer righteyewhite2;
    private final AdvancedModelRenderer righteyewhite3;
    private final AdvancedModelRenderer righteyewhite4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cheeks;
    private final AdvancedModelRenderer leftgill;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;

    public ModelBrannerion() {
        this.textureWidth = 64;
        this.textureHeight = 48;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 14.5F, -4.3F);
        this.root.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 17, 37, -2.0F, -2.0F, -5.0F, 4, 6, 5, 0.0F, true));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.01F, -0.2F, -0.5F);
        this.bodyfront.addChild(bodymiddle);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 36, -2.0F, -3.0F, 0.0F, 4, 8, 4, 0.0F, true));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.0F, 0.6F, 3.5F);
        this.bodymiddle.addChild(bodyend);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 0, 23, -1.5F, -3.0F, 0.0F, 3, 7, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.4F, 4.6F);
        this.bodyend.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 34, 25, -1.0F, -1.7F, 0.0F, 2, 4, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3F, 3.6F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 45, 30, -0.5F, -1.5F, 0.0F, 1, 3, 4, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.8F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 50, 1, 0.0F, -4.5F, 0.0F, 0, 9, 7, 0.0F, true));

        this.dorsalslopetailend = new AdvancedModelRenderer(this);
        this.dorsalslopetailend.setRotationPoint(-0.01F, -2.1F, 0.0F);
        this.tail2.addChild(dorsalslopetailend);
        this.setRotateAngle(dorsalslopetailend, -0.2759F, 0.0F, 0.0F);
        this.dorsalslopetailend.cubeList.add(new ModelBox(dorsalslopetailend, 19, 8, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.tailendunderslope = new AdvancedModelRenderer(this);
        this.tailendunderslope.setRotationPoint(0.01F, 2.1F, 0.0F);
        this.tail2.addChild(tailendunderslope);
        this.setRotateAngle(tailendunderslope, 0.2972F, 0.0F, 0.0F);
        this.tailendunderslope.cubeList.add(new ModelBox(tailendunderslope, 13, 7, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.dorsalslopetailbase = new AdvancedModelRenderer(this);
        this.dorsalslopetailbase.setRotationPoint(0.01F, -3.4F, 0.2F);
        this.tail.addChild(dorsalslopetailbase);
        this.setRotateAngle(dorsalslopetailbase, -0.4245F, 0.0F, 0.0F);
        this.dorsalslopetailbase.cubeList.add(new ModelBox(dorsalslopetailbase, 0, 16, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.tailbaseunderslope = new AdvancedModelRenderer(this);
        this.tailbaseunderslope.setRotationPoint(-0.01F, 3.6F, 0.0F);
        this.tail.addChild(tailbaseunderslope);
        this.setRotateAngle(tailbaseunderslope, 0.2972F, 0.0F, 0.0F);
        this.tailbaseunderslope.cubeList.add(new ModelBox(tailbaseunderslope, 25, 17, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.tailbaseunderslope.addChild(analfin);
        this.setRotateAngle(analfin, 0.3396F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 37, 9, 0.0F, 0.0F, 0.0F, 0, 6, 6, 0.0F, true));

        this.dorsalslopebodyend = new AdvancedModelRenderer(this);
        this.dorsalslopebodyend.setRotationPoint(-0.01F, -4.5F, 0.1F);
        this.bodyend.addChild(dorsalslopebodyend);
        this.setRotateAngle(dorsalslopebodyend, -0.2972F, 0.0F, 0.0F);
        this.dorsalslopebodyend.cubeList.add(new ModelBox(dorsalslopebodyend, 12, 18, -1.5F, 0.0F, -0.5F, 3, 2, 6, 0.0F, true));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.dorsalslopebodyend.addChild(dorsalfin);
        this.setRotateAngle(dorsalfin, -0.0424F, 0.0F, 0.0F);
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 35, 1, 0.0F, -6.0F, 0.0F, 0, 6, 7, 0.0F, true));

        this.bellyslopebodyend = new AdvancedModelRenderer(this);
        this.bellyslopebodyend.setRotationPoint(0.01F, 4.4F, 0.0F);
        this.bodyend.addChild(bellyslopebodyend);
        this.setRotateAngle(bellyslopebodyend, 0.0848F, 0.0F, 0.0F);
        this.bellyslopebodyend.cubeList.add(new ModelBox(bellyslopebodyend, 45, 18, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, true));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.06F, 0.0F, 0.5F);
        this.bellyslopebodyend.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.7854F, 0.2122F, -0.8491F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 60, 0, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.14F, 0.0F, 0.5F);
        this.bellyslopebodyend.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.7854F, -0.2122F, 0.8491F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 55, 0, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.dorsalslopemiddle = new AdvancedModelRenderer(this);
        this.dorsalslopemiddle.setRotationPoint(0.01F, -3.2F, -0.15F);
        this.bodymiddle.addChild(dorsalslopemiddle);
        this.setRotateAngle(dorsalslopemiddle, 0.2335F, 0.0F, 0.0F);
        this.dorsalslopemiddle.cubeList.add(new ModelBox(dorsalslopemiddle, 9, 11, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, true));

        this.bellyslopefront = new AdvancedModelRenderer(this);
        this.bellyslopefront.setRotationPoint(-0.01F, 4.0F, -5.0F);
        this.bodyfront.addChild(bellyslopefront);
        this.setRotateAngle(bellyslopefront, -0.1485F, 0.0F, 0.0F);
        this.bellyslopefront.cubeList.add(new ModelBox(bellyslopefront, 31, 34, -2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F, true));

        this.dorsalslopefront = new AdvancedModelRenderer(this);
        this.dorsalslopefront.setRotationPoint(-0.01F, -2.0F, -5.0F);
        this.bodyfront.addChild(dorsalslopefront);
        this.setRotateAngle(dorsalslopefront, 0.2972F, 0.0F, 0.0F);
        this.dorsalslopefront.cubeList.add(new ModelBox(dorsalslopefront, 36, 41, -2.0F, 0.0F, 0.0F, 4, 2, 5, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.01F, 0.5F, -4.1F);
        this.bodyfront.addChild(head);
        this.setRotateAngle(head, -0.2546F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 17, 27, -2.0F, -1.5F, -2.5F, 4, 5, 4, 0.0F, true));

        this.headslope = new AdvancedModelRenderer(this);
        this.headslope.setRotationPoint(0.01F, -1.5F, -2.5F);
        this.head.addChild(headslope);
        this.setRotateAngle(headslope, 0.5519F, 0.0F, 0.0F);
        this.headslope.cubeList.add(new ModelBox(headslope, 28, 4, -2.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, true));

        this.eyeportion = new AdvancedModelRenderer(this);
        this.eyeportion.setRotationPoint(0.0F, -1.5F, -2.5F);
        this.head.addChild(eyeportion);
        this.setRotateAngle(eyeportion, 0.8067F, 0.0F, 0.0F);
        this.eyeportion.cubeList.add(new ModelBox(eyeportion, 23, 9, -1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, true));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(-0.01F, 0.0F, -3.0F);
        this.eyeportion.addChild(snout);
        this.setRotateAngle(snout, 0.3609F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 18, 5, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, true));

        this.leftupperlip = new AdvancedModelRenderer(this);
        this.leftupperlip.setRotationPoint(-1.51F, 0.0F, -0.12F);
        this.snout.addChild(leftupperlip);
        this.setRotateAngle(leftupperlip, 0.3183F, -0.0424F, 0.1485F);
        this.leftupperlip.cubeList.add(new ModelBox(leftupperlip, 31, 23, 0.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, true));

        this.rightupperlip = new AdvancedModelRenderer(this);
        this.rightupperlip.setRotationPoint(1.52F, 0.0F, -0.12F);
        this.snout.addChild(rightupperlip);
        this.setRotateAngle(rightupperlip, 0.3183F, 0.0424F, -0.1485F);
        this.rightupperlip.cubeList.add(new ModelBox(rightupperlip, 44, 24, -1.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, true));

        this.lefteyepupil = new AdvancedModelRenderer(this);
        this.lefteyepupil.setRotationPoint(-0.9F, 1.15F, -2.3F);
        this.eyeportion.addChild(lefteyepupil);
        this.setRotateAngle(lefteyepupil, -0.4245F, -0.1274F, 0.1274F);
        this.lefteyepupil.cubeList.add(new ModelBox(lefteyepupil, 4, 3, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.lefteyewhite1 = new AdvancedModelRenderer(this);
        this.lefteyewhite1.setRotationPoint(0.05F, -0.25F, 0.25F);
        this.lefteyepupil.addChild(lefteyewhite1);
        this.lefteyewhite1.cubeList.add(new ModelBox(lefteyewhite1, 1, 1, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.lefteyewhite2 = new AdvancedModelRenderer(this);
        this.lefteyewhite2.setRotationPoint(0.05F, -0.25F, -0.25F);
        this.lefteyepupil.addChild(lefteyewhite2);
        this.setRotateAngle(lefteyewhite2, 0.0F, 0.0F, 0.0017F);
        this.lefteyewhite2.cubeList.add(new ModelBox(lefteyewhite2, 7, 1, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.lefteyewhite3 = new AdvancedModelRenderer(this);
        this.lefteyewhite3.setRotationPoint(0.05F, 0.25F, -0.25F);
        this.lefteyepupil.addChild(lefteyewhite3);
        this.setRotateAngle(lefteyewhite3, 0.0F, 0.0017F, 0.0F);
        this.lefteyewhite3.cubeList.add(new ModelBox(lefteyewhite3, 7, 5, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.lefteyewhite4 = new AdvancedModelRenderer(this);
        this.lefteyewhite4.setRotationPoint(0.05F, 0.25F, 0.25F);
        this.lefteyepupil.addChild(lefteyewhite4);
        this.setRotateAngle(lefteyewhite4, 0.0F, 0.0017F, 0.0F);
        this.lefteyewhite4.cubeList.add(new ModelBox(lefteyewhite4, 1, 5, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteyepupil = new AdvancedModelRenderer(this);
        this.righteyepupil.setRotationPoint(0.9F, 1.15F, -2.3F);
        this.eyeportion.addChild(righteyepupil);
        this.setRotateAngle(righteyepupil, -0.4245F, 0.1274F, -0.1274F);
        this.righteyepupil.cubeList.add(new ModelBox(righteyepupil, 4, 10, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteyewhite1 = new AdvancedModelRenderer(this);
        this.righteyewhite1.setRotationPoint(-0.05F, -0.25F, 0.25F);
        this.righteyepupil.addChild(righteyewhite1);
        this.righteyewhite1.cubeList.add(new ModelBox(righteyewhite1, 1, 8, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteyewhite2 = new AdvancedModelRenderer(this);
        this.righteyewhite2.setRotationPoint(-0.05F, -0.25F, -0.25F);
        this.righteyepupil.addChild(righteyewhite2);
        this.setRotateAngle(righteyewhite2, 0.0F, 0.0F, 0.0017F);
        this.righteyewhite2.cubeList.add(new ModelBox(righteyewhite2, 7, 8, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteyewhite3 = new AdvancedModelRenderer(this);
        this.righteyewhite3.setRotationPoint(-0.05F, 0.25F, -0.25F);
        this.righteyepupil.addChild(righteyewhite3);
        this.setRotateAngle(righteyewhite3, 0.0F, 0.0017F, 0.0F);
        this.righteyewhite3.cubeList.add(new ModelBox(righteyewhite3, 7, 12, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteyewhite4 = new AdvancedModelRenderer(this);
        this.righteyewhite4.setRotationPoint(-0.05F, 0.25F, 0.25F);
        this.righteyepupil.addChild(righteyewhite4);
        this.setRotateAngle(righteyewhite4, 0.0F, 0.0017F, 0.0F);
        this.righteyewhite4.cubeList.add(new ModelBox(righteyewhite4, 1, 12, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.49F, -2.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0848F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 0, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, true));

        this.cheeks = new AdvancedModelRenderer(this);
        this.cheeks.setRotationPoint(0.02F, 0.0F, -2.1F);
        this.jaw.addChild(cheeks);
        this.setRotateAngle(cheeks, -0.743F, 0.0F, 0.0F);
        this.cheeks.cubeList.add(new ModelBox(cheeks, 31, 0, -1.5F, -2.0F, 0.0F, 3, 2, 1, 0.0F, true));

        this.leftgill = new AdvancedModelRenderer(this);
        this.leftgill.setRotationPoint(-1.03F, 0.0F, 0.0F);
        this.head.addChild(leftgill);
        this.leftgill.cubeList.add(new ModelBox(leftgill, 52, 24, -1.0F, -1.5F, -2.5F, 1, 5, 4, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.9F, 3.6F, -3.2F);
        this.bodyfront.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.5732F, 0.1485F, -0.2972F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 48, 0, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, true));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.9F, 3.6F, -3.2F);
        this.bodyfront.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.5732F, -0.1485F, 0.2972F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 41, 0, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.0F;
        this.root.offsetX = -1.338F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 1.63F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetZ = -0.34F;
        this.root.offsetY = -0.18F;
        this.root.offsetX = -0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.14F;
        this.root.offsetZ = 0.015F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(backRightFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(root, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                this.root.offsetY = 1.4F;
                 this.root.offsetX = 1F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
