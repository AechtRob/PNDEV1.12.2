package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRhacolepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tailend;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer dorsalslopetailend;
    private final AdvancedModelRenderer underslopetailend;
    private final AdvancedModelRenderer dorsalslopetailbase;
    private final AdvancedModelRenderer underslopetailbase;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer dorsalslopebodyend;
    private final AdvancedModelRenderer underslopebodyend;
    private final AdvancedModelRenderer rightpelvicfin;
    private final AdvancedModelRenderer leftpelvicfin;
    private final AdvancedModelRenderer dorsalslopemiddle;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer eyeportion;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer rightupperlip;
    private final AdvancedModelRenderer leftupperlip;
    private final AdvancedModelRenderer eyeportionunderside;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer mouthinterior;
    private final AdvancedModelRenderer headslope;
    private final AdvancedModelRenderer dorsalslopefront;
    private final AdvancedModelRenderer rightpectoralfin;
    private final AdvancedModelRenderer leftpectoralfin;

    public ModelRhacolepis() {
        this.textureWidth = 64;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 20.0F, -1.0F);
        this.root.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0213F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 23, -1.5F, -1.5F, -5.0F, 3, 4, 5, 0.0F, true));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.01F, 0.0F, -0.5F);
        this.bodyfront.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, -0.0424F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 17, 24, -1.5F, -1.5F, 0.0F, 3, 4, 4, 0.0F, true));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.0F, 0.5F, 3.5F);
        this.bodymiddle.addChild(bodyend);
        this.setRotateAngle(bodyend, 0.0213F, 0.0F, 0.0F);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 12, 17, -1.0F, -1.5F, 0.0F, 2, 3, 3, 0.0F, true));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(-0.01F, -0.1F, 2.5F);
        this.bodyend.addChild(tailbase);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 0, 11, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, true));

        this.tailend = new AdvancedModelRenderer(this);
        this.tailend.setRotationPoint(0.0F, -0.1F, 2.6F);
        this.tailbase.addChild(tailend);
        this.tailend.cubeList.add(new ModelBox(tailend, 7, 9, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tailend.addChild(tailfin);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 0, 13, 0.0F, -2.5F, 0.0F, 0, 5, 4, 0.0F, true));

        this.dorsalslopetailend = new AdvancedModelRenderer(this);
        this.dorsalslopetailend.setRotationPoint(-0.01F, -0.9F, 0.0F);
        this.tailend.addChild(dorsalslopetailend);
        this.setRotateAngle(dorsalslopetailend, -0.0848F, 0.0F, 0.0F);
        this.dorsalslopetailend.cubeList.add(new ModelBox(dorsalslopetailend, 7, 4, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.underslopetailend = new AdvancedModelRenderer(this);
        this.underslopetailend.setRotationPoint(0.01F, 1.0F, 0.0F);
        this.tailend.addChild(underslopetailend);
        this.setRotateAngle(underslopetailend, 0.1274F, 0.0F, 0.0F);
        this.underslopetailend.cubeList.add(new ModelBox(underslopetailend, 31, 0, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.dorsalslopetailbase = new AdvancedModelRenderer(this);
        this.dorsalslopetailbase.setRotationPoint(-0.01F, -1.5F, 0.1F);
        this.tailbase.addChild(dorsalslopetailbase);
        this.setRotateAngle(dorsalslopetailbase, -0.1698F, 0.0F, 0.0F);
        this.dorsalslopetailbase.cubeList.add(new ModelBox(dorsalslopetailbase, 23, 8, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.underslopetailbase = new AdvancedModelRenderer(this);
        this.underslopetailbase.setRotationPoint(-0.01F, 1.6F, 0.1F);
        this.tailbase.addChild(underslopetailbase);
        this.setRotateAngle(underslopetailbase, 0.1911F, 0.0F, 0.0F);
        this.underslopetailbase.cubeList.add(new ModelBox(underslopetailbase, 31, 6, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 0.1F, 1.6F);
        this.underslopetailbase.addChild(analfin);
        this.setRotateAngle(analfin, 0.4245F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 0, 3, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.dorsalslopebodyend = new AdvancedModelRenderer(this);
        this.dorsalslopebodyend.setRotationPoint(0.01F, -2.2F, 0.1F);
        this.bodyend.addChild(dorsalslopebodyend);
        this.setRotateAngle(dorsalslopebodyend, -0.1911F, 0.0F, 0.0F);
        this.dorsalslopebodyend.cubeList.add(new ModelBox(dorsalslopebodyend, 23, 3, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.underslopebodyend = new AdvancedModelRenderer(this);
        this.underslopebodyend.setRotationPoint(0.01F, 2.0F, 0.1F);
        this.bodyend.addChild(underslopebodyend);
        this.setRotateAngle(underslopebodyend, 0.1698F, 0.0F, 0.0F);
        this.underslopebodyend.cubeList.add(new ModelBox(underslopebodyend, 15, 1, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(0.4F, 0.0F, 2.0F);
        this.underslopebodyend.addChild(rightpelvicfin);
        this.setRotateAngle(rightpelvicfin, 0.2972F, 0.3183F, -0.6156F);
        this.rightpelvicfin.cubeList.add(new ModelBox(rightpelvicfin, 27, 0, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(-0.4F, 0.0F, 2.0F);
        this.underslopebodyend.addChild(leftpelvicfin);
        this.setRotateAngle(leftpelvicfin, 0.2972F, -0.3183F, 0.6156F);
        this.leftpelvicfin.cubeList.add(new ModelBox(leftpelvicfin, 0, 0, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.dorsalslopemiddle = new AdvancedModelRenderer(this);
        this.dorsalslopemiddle.setRotationPoint(-0.02F, -1.9F, 0.0F);
        this.bodymiddle.addChild(dorsalslopemiddle);
        this.setRotateAngle(dorsalslopemiddle, -0.0532F, 0.0F, 0.0F);
        this.dorsalslopemiddle.cubeList.add(new ModelBox(dorsalslopemiddle, 20, 13, -1.5F, 0.0F, 0.0F, 3, 1, 4, 0.0F, true));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, 0.5F, 2.2F);
        this.dorsalslopemiddle.addChild(dorsalfin);
        this.setRotateAngle(dorsalfin, 0.1061F, 0.0F, 0.0F);
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 0, 5, 0.0F, -2.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, 0.4F, -4.4F);
        this.bodyfront.addChild(head);
        this.setRotateAngle(head, -0.1485F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 28, 19, -1.5F, -1.0F, -3.0F, 3, 3, 3, 0.0F, true));

        this.eyeportion = new AdvancedModelRenderer(this);
        this.eyeportion.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.head.addChild(eyeportion);
        this.setRotateAngle(eyeportion, 0.4458F, 0.0F, 0.0F);
        this.eyeportion.cubeList.add(new ModelBox(eyeportion, 40, 0, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, true));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.eyeportion.addChild(snout);
        this.setRotateAngle(snout, 0.0424F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 11, 0, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.rightupperlip = new AdvancedModelRenderer(this);
        this.rightupperlip.setRotationPoint(0.5F, 0.5F, -2.0F);
        this.snout.addChild(rightupperlip);
        this.setRotateAngle(rightupperlip, -0.4033F, 0.1061F, -0.1061F);
        this.rightupperlip.cubeList.add(new ModelBox(rightupperlip, 39, 4, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.leftupperlip = new AdvancedModelRenderer(this);
        this.leftupperlip.setRotationPoint(-0.5F, 0.5F, -2.0F);
        this.snout.addChild(leftupperlip);
        this.setRotateAngle(leftupperlip, -0.4033F, -0.1061F, 0.1061F);
        this.leftupperlip.cubeList.add(new ModelBox(leftupperlip, 31, 11, 0.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.eyeportionunderside = new AdvancedModelRenderer(this);
        this.eyeportionunderside.setRotationPoint(-0.01F, 2.0F, -2.0F);
        this.eyeportion.addChild(eyeportionunderside);
        this.setRotateAngle(eyeportionunderside, -0.7641F, 0.0F, 0.0F);
        this.eyeportionunderside.cubeList.add(new ModelBox(eyeportionunderside, 4, 0, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.9F, -0.6F);
        this.eyeportion.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.4458F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 11, 11, -0.5F, 0.0F, -3.5F, 1, 1, 4, -0.005F, true));

        this.mouthinterior = new AdvancedModelRenderer(this);
        this.mouthinterior.setRotationPoint(0.01F, 0.0F, -2.2F);
        this.lowerjaw.addChild(mouthinterior);
        this.setRotateAngle(mouthinterior, 0.5519F, 0.0F, 0.0F);
        this.mouthinterior.cubeList.add(new ModelBox(mouthinterior, 4, 3, -0.51F, 0.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.headslope = new AdvancedModelRenderer(this);
        this.headslope.setRotationPoint(-0.01F, -1.0F, -3.0F);
        this.head.addChild(headslope);
        this.setRotateAngle(headslope, 0.3183F, 0.0F, 0.0F);
        this.headslope.cubeList.add(new ModelBox(headslope, 13, 6, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, true));

        this.dorsalslopefront = new AdvancedModelRenderer(this);
        this.dorsalslopefront.setRotationPoint(0.02F, -1.5F, -5.0F);
        this.bodyfront.addChild(dorsalslopefront);
        this.setRotateAngle(dorsalslopefront, 0.0848F, 0.0F, 0.0F);
        this.dorsalslopefront.cubeList.add(new ModelBox(dorsalslopefront, 32, 26, -1.5F, 0.0F, 0.0F, 3, 1, 5, 0.0F, true));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(1.45F, 1.7F, -4.2F);
        this.bodyfront.addChild(rightpectoralfin);
        this.setRotateAngle(rightpectoralfin, 0.1061F, 0.4671F, 0.0F);
        this.rightpectoralfin.cubeList.add(new ModelBox(rightpectoralfin, 0, 1, 0.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, true));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(-1.45F, 1.7F, -4.2F);
        this.bodyfront.addChild(leftpectoralfin);
        this.setRotateAngle(leftpectoralfin, 0.1061F, -0.4671F, 0.0F);
        this.leftpectoralfin.cubeList.add(new ModelBox(leftpectoralfin, 22, 0, 0.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, true));

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
        AdvancedModelRenderer[] fishTail = {this.bodyend, this.tailbase, this.tailend, this.tailfin};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(lowerjaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(leftpectoralfin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(leftpectoralfin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(rightpelvicfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(rightpelvicfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(leftpelvicfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(leftpelvicfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


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
