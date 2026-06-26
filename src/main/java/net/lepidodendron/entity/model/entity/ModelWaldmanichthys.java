package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWaldmanichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tailslopelower;
    private final AdvancedModelRenderer dorsalslopetail;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer bellyslopeend;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer dorsalslopebody;
    private final AdvancedModelRenderer bellyslopemiddle;
    private final AdvancedModelRenderer rightpelvicfin;
    private final AdvancedModelRenderer leftpelvicfin;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer bellyslopefront;
    private final AdvancedModelRenderer rightpectoralfin;
    private final AdvancedModelRenderer leftpectoralfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer dorsalslopehead;
    private final AdvancedModelRenderer headunderside;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer rightcheek;
    private final AdvancedModelRenderer leftcheek;
    private final AdvancedModelRenderer lefteye;

    private ModelAnimator animator;

    public ModelWaldmanichthys() {
        this.textureWidth = 64;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.root.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0637F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 24, -1.5F, -2.0F, -4.0F, 3, 4, 4, 0.0F, true));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(-0.01F, 0.2F, -0.7F);
        this.bodyfront.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, -0.0848F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 15, 22, -1.5F, -2.2F, 0.0F, 3, 5, 5, 0.0F, true));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.0F, 0.2F, 4.4F);
        this.bodymiddle.addChild(bodyend);
        this.setRotateAngle(bodyend, 0.0213F, 0.0F, 0.0F);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 32, 24, -1.0F, -2.0F, 0.0F, 2, 4, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 3.6F);
        this.bodyend.addChild(tail);
        this.setRotateAngle(tail, 0.0213F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 41, 21, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.tailslopelower = new AdvancedModelRenderer(this);
        this.tailslopelower.setRotationPoint(0.01F, 1.0F, -0.15F);
        this.tail.addChild(tailslopelower);
        this.setRotateAngle(tailslopelower, 0.2335F, 0.0F, 0.0F);
        this.tailslopelower.cubeList.add(new ModelBox(tailslopelower, 11, 15, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.dorsalslopetail = new AdvancedModelRenderer(this);
        this.dorsalslopetail.setRotationPoint(-0.01F, -1.95F, 0.1F);
        this.tail.addChild(dorsalslopetail);
        this.setRotateAngle(dorsalslopetail, -0.1911F, 0.0F, 0.0F);
        this.dorsalslopetail.cubeList.add(new ModelBox(dorsalslopetail, 29, 18, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail.addChild(tailfin);
        this.setRotateAngle(tailfin, -0.0424F, 0.0F, 0.0F);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 54, 0, 0.0F, -3.5F, 0.0F, 0, 7, 5, 0.0F, true));

        this.bellyslopeend = new AdvancedModelRenderer(this);
        this.bellyslopeend.setRotationPoint(-0.01F, 2.0F, -0.1F);
        this.bodyend.addChild(bellyslopeend);
        this.setRotateAngle(bellyslopeend, 0.2459F, 0.0F, 0.0F);
        this.bellyslopeend.cubeList.add(new ModelBox(bellyslopeend, 21, 16, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, true));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 1.0F, 3.3F);
        this.bellyslopeend.addChild(analfin);
        this.setRotateAngle(analfin, 0.8915F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 49, 7, 0.0F, -0.7F, 0.0F, 0, 3, 2, 0.0F, true));

        this.dorsalslopebody = new AdvancedModelRenderer(this);
        this.dorsalslopebody.setRotationPoint(0.01F, -2.4F, 0.0F);
        this.bodyend.addChild(dorsalslopebody);
        this.setRotateAngle(dorsalslopebody, -0.1009F, 0.0F, 0.0F);
        this.dorsalslopebody.cubeList.add(new ModelBox(dorsalslopebody, 0, 11, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, true));

        this.bellyslopemiddle = new AdvancedModelRenderer(this);
        this.bellyslopemiddle.setRotationPoint(0.01F, 2.65F, 0.0F);
        this.bodymiddle.addChild(bellyslopemiddle);
        this.setRotateAngle(bellyslopemiddle, -0.0143F, 0.0F, 0.0F);
        this.bellyslopemiddle.cubeList.add(new ModelBox(bellyslopemiddle, 47, 26, -1.5F, -0.5F, 0.0F, 3, 1, 5, 0.0F, true));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(0.5F, 0.5F, 3.0F);
        this.bellyslopemiddle.addChild(rightpelvicfin);
        this.setRotateAngle(rightpelvicfin, 0.7854F, 0.0F, -0.4245F);
        this.rightpelvicfin.cubeList.add(new ModelBox(rightpelvicfin, 42, 7, 0.0F, -0.7F, 0.0F, 0, 4, 3, 0.0F, true));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(-0.5F, 0.5F, 3.0F);
        this.bellyslopemiddle.addChild(leftpelvicfin);
        this.setRotateAngle(leftpelvicfin, 0.7854F, 0.0F, 0.4245F);
        this.leftpelvicfin.cubeList.add(new ModelBox(leftpelvicfin, 38, 3, 0.0F, -0.7F, 0.0F, 0, 4, 3, 0.0F, true));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, -2.3F, 1.9F);
        this.bodymiddle.addChild(dorsalfin);
        this.setRotateAngle(dorsalfin, -0.8278F, 0.0F, 0.0F);
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 49, 10, 0.0F, -3.7F, 0.0F, 0, 4, 3, 0.0F, true));

        this.bellyslopefront = new AdvancedModelRenderer(this);
        this.bellyslopefront.setRotationPoint(-0.02F, 2.8F, -4.1F);
        this.bodyfront.addChild(bellyslopefront);
        this.setRotateAngle(bellyslopefront, -0.1485F, 0.0F, 0.0F);
        this.bellyslopefront.cubeList.add(new ModelBox(bellyslopefront, 10, 8, -1.5F, -2.0F, 0.0F, 3, 2, 4, 0.0F, true));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(1.5F, -0.7F, 0.1F);
        this.bellyslopefront.addChild(rightpectoralfin);
        this.setRotateAngle(rightpectoralfin, 0.0F, 0.4033F, 0.0F);
        this.rightpectoralfin.cubeList.add(new ModelBox(rightpectoralfin, 47, 3, 0.0F, -0.25F, -0.1F, 0, 2, 3, 0.0F, true));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(-1.5F, -0.7F, 0.1F);
        this.bellyslopefront.addChild(leftpectoralfin);
        this.setRotateAngle(leftpectoralfin, 0.0F, -0.4033F, 0.0F);
        this.leftpectoralfin.cubeList.add(new ModelBox(leftpectoralfin, 47, 0, 0.0F, -0.25F, -0.1F, 0, 2, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, 0.1F, -3.5F);
        this.bodyfront.addChild(head);
        this.setRotateAngle(head, -0.0637F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 25, 7, -1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F, true));

        this.dorsalslopehead = new AdvancedModelRenderer(this);
        this.dorsalslopehead.setRotationPoint(-0.01F, -2.1F, 0.0F);
        this.head.addChild(dorsalslopehead);
        this.setRotateAngle(dorsalslopehead, 0.1485F, 0.0F, 0.0F);
        this.dorsalslopehead.cubeList.add(new ModelBox(dorsalslopehead, 36, 15, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, true));

        this.headunderside = new AdvancedModelRenderer(this);
        this.headunderside.setRotationPoint(0.02F, 2.7F, -0.15F);
        this.head.addChild(headunderside);
        this.setRotateAngle(headunderside, -0.2972F, 0.0F, 0.0F);
        this.headunderside.cubeList.add(new ModelBox(headunderside, 0, 17, -1.5F, -2.0F, -4.0F, 3, 2, 4, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(1.05F, -0.6F, -3.3F);
        this.head.addChild(righteye);
        this.righteye.cubeList.add(new ModelBox(righteye, 6, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.01F, -1.5F, -4.0F);
        this.head.addChild(snout);
        this.setRotateAngle(snout, 0.4671F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 0, 6, -1.5F, 0.0F, -1.0F, 3, 3, 1, 0.0F, true));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(-0.02F, 0.0F, -1.0F);
        this.snout.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.6369F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 9, 4, -1.5F, 0.0F, -1.0F, 3, 3, 1, 0.0F, true));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.6F, -2.8F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.384F, 0.0038F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 16, 0, -1.5F, -0.7F, -3.0F, 3, 1, 3, 0.0F, true));

        this.rightcheek = new AdvancedModelRenderer(this);
        this.rightcheek.setRotationPoint(1.48F, -0.7F, -2.6F);
        this.lowerjaw.addChild(rightcheek);
        this.setRotateAngle(rightcheek, -0.8067F, -0.0213F, -0.0424F);
        this.rightcheek.cubeList.add(new ModelBox(rightcheek, 38, 0, -2.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F, true));

        this.leftcheek = new AdvancedModelRenderer(this);
        this.leftcheek.setRotationPoint(-1.48F, -0.7F, -2.6F);
        this.lowerjaw.addChild(leftcheek);
        this.setRotateAngle(leftcheek, -0.8067F, 0.0213F, 0.0424F);
        this.leftcheek.cubeList.add(new ModelBox(leftcheek, 29, 0, 0.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-1.05F, -0.6F, -3.3F);
        this.head.addChild(lefteye);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 1, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
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
            this.swing(root, speed, 0.3F, true, 0, 0, f2, 0.8F);
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
            this.root.offsetY = 1.4F;
            this.root.offsetX = 1.F;
            this.bob(root, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {

    }
}

