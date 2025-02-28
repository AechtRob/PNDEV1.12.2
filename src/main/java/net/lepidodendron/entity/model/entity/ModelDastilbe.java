package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDastilbe extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer dorsalslopeback;
    private final AdvancedModelRenderer bellyslopeback;
    private final AdvancedModelRenderer dorsalslopefront;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer bellyslopefront;
    private final AdvancedModelRenderer rightpelvicfin;
    private final AdvancedModelRenderer leftpelvicfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headfront;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer headslope;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer headunderside;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer rightpectoralfin;
    private final AdvancedModelRenderer leftpectoralfin;
    public ModelDastilbe() {
        this.textureWidth = 64;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 20.5F, -1.5F);
        this.root.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 10, -1.0F, -1.5F, -3.0F, 2, 4, 3, 0.0F, true));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(-0.01F, 0.2F, -0.6F);
        this.bodyfront.addChild(bodymiddle);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 18, -1.0F, -1.2F, 0.0F, 2, 3, 5, 0.0F, true));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.0F, 0.3F, 4.6F);
        this.bodymiddle.addChild(bodyend);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 10, 16, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.01F, 0.01F, 3.6F);
        this.bodyend.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 27, 26, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, -0.1F, 3.1F);
        this.tail.addChild(tailfin);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 0, 21, 0.0F, -2.5F, 0.0F, 0, 5, 6, 0.0F, true));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 1.1F, -0.2F);
        this.tail.addChild(analfin);
        this.setRotateAngle(analfin, -0.4671F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 0, 16, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.dorsalslopeback = new AdvancedModelRenderer(this);
        this.dorsalslopeback.setRotationPoint(0.01F, -1.5F, 0.0F);
        this.bodyend.addChild(dorsalslopeback);
        this.setRotateAngle(dorsalslopeback, -0.1274F, 0.0F, 0.0F);
        this.dorsalslopeback.cubeList.add(new ModelBox(dorsalslopeback, 31, 20, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.bellyslopeback = new AdvancedModelRenderer(this);
        this.bellyslopeback.setRotationPoint(0.01F, 1.5F, 0.0F);
        this.bodyend.addChild(bellyslopeback);
        this.setRotateAngle(bellyslopeback, 0.1274F, 0.0F, 0.0F);
        this.bellyslopeback.cubeList.add(new ModelBox(bellyslopeback, 8, 7, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.dorsalslopefront = new AdvancedModelRenderer(this);
        this.dorsalslopefront.setRotationPoint(-0.01F, -1.7F, 0.0F);
        this.bodymiddle.addChild(dorsalslopefront);
        this.setRotateAngle(dorsalslopefront, -0.1009F, 0.0F, 0.0F);
        this.dorsalslopefront.cubeList.add(new ModelBox(dorsalslopefront, 16, 18, -1.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, true));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, 0.4F, 2.9F);
        this.dorsalslopefront.addChild(dorsalfin);
        this.setRotateAngle(dorsalfin, 0.0848F, 0.0F, 0.0F);
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 22, 21, 0.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.bellyslopefront = new AdvancedModelRenderer(this);
        this.bellyslopefront.setRotationPoint(-0.01F, 2.3F, 0.0F);
        this.bodymiddle.addChild(bellyslopefront);
        this.setRotateAngle(bellyslopefront, 0.1009F, 0.0F, 0.0F);
        this.bellyslopefront.cubeList.add(new ModelBox(bellyslopefront, 14, 9, -1.0F, -1.0F, 0.0F, 2, 1, 5, 0.0F, true));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(0.9F, -0.5F, 4.5F);
        this.bellyslopefront.addChild(rightpelvicfin);
        this.setRotateAngle(rightpelvicfin, -0.5308F, 0.1274F, -0.2759F);
        this.rightpelvicfin.cubeList.add(new ModelBox(rightpelvicfin, 29, 5, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(-0.9F, -0.5F, 4.5F);
        this.bellyslopefront.addChild(leftpelvicfin);
        this.setRotateAngle(leftpelvicfin, -0.5308F, -0.1274F, 0.2759F);
        this.leftpelvicfin.cubeList.add(new ModelBox(leftpelvicfin, 29, 7, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.01F, 0.1F, -2.6F);
        this.bodyfront.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 13, 25, -1.0F, -1.0F, -4.0F, 2, 3, 4, 0.0F, true));

        this.headfront = new AdvancedModelRenderer(this);
        this.headfront.setRotationPoint(-0.01F, -1.0F, -4.0F);
        this.head.addChild(headfront);
        this.setRotateAngle(headfront, 0.3609F, 0.0F, 0.0F);
        this.headfront.cubeList.add(new ModelBox(headfront, 11, 0, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, true));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(-0.01F, 0.0F, -2.0F);
        this.headfront.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.7217F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 25, 0, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-0.6F, 0.7F, -0.6F);
        this.headfront.addChild(lefteye);
        this.setRotateAngle(lefteye, -0.3609F, -0.1274F, 0.0637F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 6, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(0.6F, 0.7F, -0.6F);
        this.headfront.addChild(righteye);
        this.setRotateAngle(righteye, -0.3609F, 0.1274F, -0.0637F);
        this.righteye.cubeList.add(new ModelBox(righteye, 1, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.headslope = new AdvancedModelRenderer(this);
        this.headslope.setRotationPoint(0.01F, -1.6F, 0.0F);
        this.head.addChild(headslope);
        this.setRotateAngle(headslope, 0.1485F, 0.0F, 0.0F);
        this.headslope.cubeList.add(new ModelBox(headslope, 26, 14, -1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F, true));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 2.0F, -3.37F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.2759F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 4, -0.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F, true));

        this.headunderside = new AdvancedModelRenderer(this);
        this.headunderside.setRotationPoint(0.01F, 2.4F, 0.0F);
        this.head.addChild(headunderside);
        this.setRotateAngle(headunderside, -0.1026F, 0.0F, 0.0F);
        this.headunderside.cubeList.add(new ModelBox(headunderside, 16, 3, -1.0F, -1.0F, -4.0F, 2, 1, 4, 0.0F, true));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.44F, -4.01F);
        this.head.addChild(throat);
        this.throat.cubeList.add(new ModelBox(throat, 20, 0, -1.0F, -1.0F, 0.0F, 2, 2, 0, 0.0F, true));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(0.9F, 1.6F, -2.5F);
        this.bodyfront.addChild(rightpectoralfin);
        this.setRotateAngle(rightpectoralfin, -0.3821F, 0.3609F, 0.0F);
        this.rightpectoralfin.cubeList.add(new ModelBox(rightpectoralfin, 7, 2, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(-0.9F, 1.6F, -2.5F);
        this.bodyfront.addChild(leftpectoralfin);
        this.setRotateAngle(leftpectoralfin, -0.3821F, -0.3609F, 0.0F);
        this.leftpectoralfin.cubeList.add(new ModelBox(leftpectoralfin, 25, 2, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -5.6F;
        this.root.offsetX = 0.30F;
        this.root.rotateAngleY = (float)Math.toRadians(250);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 3.25F;
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
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.root.offsetX = -0.14F;
        this.root.offsetY = -0.19F;
        this.root.offsetZ = 0.06F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bodyfront, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bodymiddle, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bodyend, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.root.offsetY = 0.139F;
        this.root.render(0.01f);
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
        AdvancedModelRenderer[] fishTail = {this.bodyend, this.tail, this.tailfin};
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
                 this.root.offsetX = 1.3F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
