package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTharrhias extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer taildorsalslope;
    private final AdvancedModelRenderer tailventralslope;
    private final AdvancedModelRenderer bodyenddorsalslope;
    private final AdvancedModelRenderer bodyendventralslope;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer bodymiddleslope;
    private final AdvancedModelRenderer Dorsalfin;
    private final AdvancedModelRenderer rightpelvicfin;
    private final AdvancedModelRenderer leftpelvicfin;
    private final AdvancedModelRenderer bodyfrontslope1;
    private final AdvancedModelRenderer bodyfrontslope2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headslope;
    private final AdvancedModelRenderer eyeportion;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer snoutunderside;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer leftcheek;
    private final AdvancedModelRenderer rightcheek;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer gillslope;
    private final AdvancedModelRenderer leftgill;
    private final AdvancedModelRenderer rightgill;
    private final AdvancedModelRenderer rightpectoralfin;
    private final AdvancedModelRenderer leftpectoralfin;

    private ModelAnimator animator;

    public ModelTharrhias() {
        this.textureWidth = 64;
        this.textureHeight = 48;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 18.6F, -4.4F);
        this.root.addChild(bodyfront);
        this.setRotateAngle(bodyfront, -0.0424F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 36, -1.5F, -2.0F, -6.0F, 3, 6, 6, 0.02F, true));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(-0.01F, -0.05F, -0.9F);
        this.bodyfront.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, 0.1274F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 21, -1.49F, -2.0F, 0.0F, 3, 6, 8, 0.0F, true));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.0F, 1.0F, 7.5F);
        this.bodymiddle.addChild(bodyend);
        this.setRotateAngle(bodyend, -0.0848F, 0.0F, 0.0F);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 19, 39, -0.99F, -2.0F, 0.0F, 2, 4, 5, 0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 4.6F);
        this.bodyend.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 13, -0.49F, -1.5F, 0.0F, 1, 3, 4, 0.01F, true));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, 0.0F, 3.7F);
        this.tail.addChild(tailfin);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 50, 4, 0.0F, -4.5F, 0.0F, 0, 9, 7, 0.0F, true));

        this.taildorsalslope = new AdvancedModelRenderer(this);
        this.taildorsalslope.setRotationPoint(-0.01F, -2.0F, 0.0F);
        this.tail.addChild(taildorsalslope);
        this.setRotateAngle(taildorsalslope, -0.1698F, 0.0F, 0.0F);
        this.taildorsalslope.cubeList.add(new ModelBox(taildorsalslope, 11, 3, -0.48F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tailventralslope = new AdvancedModelRenderer(this);
        this.tailventralslope.setRotationPoint(-0.01F, 2.0F, 0.0F);
        this.tail.addChild(tailventralslope);
        this.setRotateAngle(tailventralslope, 0.1698F, 0.0F, 0.0F);
        this.tailventralslope.cubeList.add(new ModelBox(tailventralslope, 22, 8, -0.48F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.bodyenddorsalslope = new AdvancedModelRenderer(this);
        this.bodyenddorsalslope.setRotationPoint(0.01F, -3.0F, 0.0F);
        this.bodyend.addChild(bodyenddorsalslope);
        this.setRotateAngle(bodyenddorsalslope, -0.1911F, 0.0F, 0.0F);
        this.bodyenddorsalslope.cubeList.add(new ModelBox(bodyenddorsalslope, 18, 31, -1.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, true));

        this.bodyendventralslope = new AdvancedModelRenderer(this);
        this.bodyendventralslope.setRotationPoint(0.01F, 3.0F, 0.0F);
        this.bodyend.addChild(bodyendventralslope);
        this.setRotateAngle(bodyendventralslope, 0.2122F, 0.0F, 0.0F);
        this.bodyendventralslope.cubeList.add(new ModelBox(bodyendventralslope, 15, 22, -1.0F, -1.0F, 0.0F, 2, 1, 5, 0.0F, true));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.bodyendventralslope.addChild(analfin);
        this.setRotateAngle(analfin, -0.5943F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 58, 18, 0.0F, -2.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.bodymiddleslope = new AdvancedModelRenderer(this);
        this.bodymiddleslope.setRotationPoint(-0.02F, -3.02F, 0.0F);
        this.bodymiddle.addChild(bodymiddleslope);
        this.setRotateAngle(bodymiddleslope, -0.1274F, 0.0F, 0.0F);
        this.bodymiddleslope.cubeList.add(new ModelBox(bodymiddleslope, 36, 39, -1.47F, 0.0F, 0.0F, 3, 1, 8, -0.01F, true));

        this.Dorsalfin = new AdvancedModelRenderer(this);
        this.Dorsalfin.setRotationPoint(0.0F, 0.0F, 3.1F);
        this.bodymiddleslope.addChild(Dorsalfin);
        this.setRotateAngle(Dorsalfin, 0.4033F, 0.0F, 0.0F);
        this.Dorsalfin.cubeList.add(new ModelBox(Dorsalfin, 52, 1, 0.0F, 0.0F, 0.0F, 0, 3, 6, 0.0F, true));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(0.8F, 4.0F, 3.5F);
        this.bodymiddle.addChild(rightpelvicfin);
        this.setRotateAngle(rightpelvicfin, -0.5519F, 0.0637F, -0.3183F);
        this.rightpelvicfin.cubeList.add(new ModelBox(rightpelvicfin, 56, 0, 0.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(-0.8F, 4.0F, 3.5F);
        this.bodymiddle.addChild(leftpelvicfin);
        this.setRotateAngle(leftpelvicfin, -0.5519F, -0.0637F, 0.3183F);
        this.leftpelvicfin.cubeList.add(new ModelBox(leftpelvicfin, 47, 0, 0.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.bodyfrontslope1 = new AdvancedModelRenderer(this);
        this.bodyfrontslope1.setRotationPoint(-0.02F, -2.1F, -0.1F);
        this.bodyfront.addChild(bodyfrontslope1);
        this.setRotateAngle(bodyfrontslope1, 0.0424F, 0.0F, 0.0F);
        this.bodyfrontslope1.cubeList.add(new ModelBox(bodyfrontslope1, 39, 26, -1.48F, -1.0F, -3.0F, 3, 2, 3, 0.0F, true));

        this.bodyfrontslope2 = new AdvancedModelRenderer(this);
        this.bodyfrontslope2.setRotationPoint(0.03F, -1.0F, -3.0F);
        this.bodyfrontslope1.addChild(bodyfrontslope2);
        this.setRotateAngle(bodyfrontslope2, 0.1785F, 0.0F, 0.0F);
        this.bodyfrontslope2.cubeList.add(new ModelBox(bodyfrontslope2, 29, 14, -1.51F, 0.0F, -3.0F, 3, 2, 3, 0.01F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, 0.4F, -5.3F);
        this.bodyfront.addChild(head);
        this.setRotateAngle(head, 0.0424F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 29, 35, -1.49F, -1.0F, -4.0F, 3, 4, 4, 0.01F, true));

        this.headslope = new AdvancedModelRenderer(this);
        this.headslope.setRotationPoint(-0.01F, -1.0F, -4.0F);
        this.head.addChild(headslope);
        this.setRotateAngle(headslope, 0.2759F, 0.0F, 0.0F);
        this.headslope.cubeList.add(new ModelBox(headslope, 28, 28, -1.48F, -0.7F, 0.0F, 3, 2, 4, -0.01F, true));

        this.eyeportion = new AdvancedModelRenderer(this);
        this.eyeportion.setRotationPoint(0.02F, -0.7F, 0.0F);
        this.headslope.addChild(eyeportion);
        this.setRotateAngle(eyeportion, 0.2335F, 0.0F, 0.0F);
        this.eyeportion.cubeList.add(new ModelBox(eyeportion, 26, 20, -1.5F, 0.0F, -2.0F, 3, 4, 2, 0.0F, true));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.01F, 0.0F, -2.0F);
        this.eyeportion.addChild(snout);
        this.setRotateAngle(snout, 0.0213F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 11, 8, -1.51F, 0.0F, -2.0F, 3, 2, 2, 0.0F, true));

        this.snoutunderside = new AdvancedModelRenderer(this);
        this.snoutunderside.setRotationPoint(-0.03F, 2.0F, -2.0F);
        this.snout.addChild(snoutunderside);
        this.setRotateAngle(snoutunderside, 0.7217F, 0.0F, 0.0F);
        this.snoutunderside.cubeList.add(new ModelBox(snoutunderside, 0, 7, -1.48F, 0.0F, 0.0F, 3, 3, 2, 0.02F, true));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.6F, 0.55F);
        this.snoutunderside.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 7, 2, -1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F, true));

        this.leftcheek = new AdvancedModelRenderer(this);
        this.leftcheek.setRotationPoint(-1.01F, -1.7F, 0.5F);
        this.lowerjaw.addChild(leftcheek);
        this.setRotateAngle(leftcheek, -0.658F, 0.0F, 0.0F);
        this.leftcheek.cubeList.add(new ModelBox(leftcheek, 4, 2, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.rightcheek = new AdvancedModelRenderer(this);
        this.rightcheek.setRotationPoint(1.01F, -1.7F, 0.5F);
        this.lowerjaw.addChild(rightcheek);
        this.setRotateAngle(rightcheek, -0.658F, 0.0F, 0.0F);
        this.rightcheek.cubeList.add(new ModelBox(rightcheek, 5, 4, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.02F, 0.0F, -2.0F);
        this.snout.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.5943F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 20, 4, -1.53F, 0.0F, -1.0F, 3, 2, 1, -0.01F, true));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.8F, -1.01F);
        this.upperjaw.addChild(throat);
        this.throat.cubeList.add(new ModelBox(throat, 6, 0, -1.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-1.1F, 1.5F, -1.65F);
        this.eyeportion.addChild(lefteye);
        this.setRotateAngle(lefteye, -0.5095F, -0.1061F, 0.0F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 0, 3, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(1.1F, 1.5F, -1.65F);
        this.eyeportion.addChild(righteye);
        this.setRotateAngle(righteye, -0.5095F, 0.1061F, 0.0F);
        this.righteye.cubeList.add(new ModelBox(righteye, 1, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.gillslope = new AdvancedModelRenderer(this);
        this.gillslope.setRotationPoint(0.02F, 3.0F, -4.0F);
        this.head.addChild(gillslope);
        this.setRotateAngle(gillslope, -0.1485F, 0.0F, 0.0F);
        this.gillslope.cubeList.add(new ModelBox(gillslope, 40, 33, -1.51F, -1.0F, 0.0F, 3, 1, 4, 0.0F, true));

        this.leftgill = new AdvancedModelRenderer(this);
        this.leftgill.setRotationPoint(-0.5F, 1.0F, -2.8F);
        this.head.addChild(leftgill);
        this.setRotateAngle(leftgill, 0.0424F, -0.0213F, 0.0F);
        this.leftgill.cubeList.add(new ModelBox(leftgill, 11, 13, -0.99F, -2.0F, 0.0F, 1, 4, 3, 0.0F, true));

        this.rightgill = new AdvancedModelRenderer(this);
        this.rightgill.setRotationPoint(0.5F, 1.0F, -2.8F);
        this.head.addChild(rightgill);
        this.setRotateAngle(rightgill, 0.0424F, 0.0213F, 0.0F);
        this.rightgill.cubeList.add(new ModelBox(rightgill, 20, 13, 0.01F, -2.0F, 0.0F, 1, 4, 3, 0.0F, true));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(1.4F, 3.3F, -4.8F);
        this.bodyfront.addChild(rightpectoralfin);
        this.setRotateAngle(rightpectoralfin, 1.1675F, 0.2335F, -0.2122F);
        this.rightpectoralfin.cubeList.add(new ModelBox(rightpectoralfin, 45, 5, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, true));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(-1.4F, 3.3F, -4.8F);
        this.bodyfront.addChild(leftpectoralfin);
        this.setRotateAngle(leftpectoralfin, 1.1675F, -0.2335F, 0.2122F);
        this.leftpectoralfin.cubeList.add(new ModelBox(leftpectoralfin, 45, 10, 0.0F, 0.0F, -0.4F, 0, 4, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.5F;
        this.root.offsetX = 0.258F;
        this.root.rotateAngleY = (float)Math.toRadians(235);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 0.95F;
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
        this.root.offsetX = -0.14F;
        this.root.offsetY = -0.19F;
        this.root.offsetZ = 0.06F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.18F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.bodyend, this.tail, this.tailfin};

        float speed = 0.186F;
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(root, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(leftpectoralfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(leftpectoralfin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(rightpectoralfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(rightpectoralfin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(leftpelvicfin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(leftpelvicfin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(rightpelvicfin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(rightpelvicfin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = 1.3F;
            this.root.offsetX = 1.1F;
            this.bob(root, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {

    }
}

