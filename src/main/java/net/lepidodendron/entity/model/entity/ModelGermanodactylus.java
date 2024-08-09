package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGermanodactylus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelGermanodactylus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended upperlegL;
    private final AdvancedModelRendererExtended lowerlegL;
    private final AdvancedModelRendererExtended footL;
    private final AdvancedModelRendererExtended legwing11;
    private final AdvancedModelRendererExtended legwing12;
    private final AdvancedModelRendererExtended upperlegR;
    private final AdvancedModelRendererExtended lowerlegR;
    private final AdvancedModelRendererExtended footR;
    private final AdvancedModelRendererExtended legwing2;
    private final AdvancedModelRendererExtended legwing3;
    private final AdvancedModelRendererExtended wingright1;
    private final AdvancedModelRendererExtended wingright2;
    private final AdvancedModelRendererExtended wingrightmembrane;
    private final AdvancedModelRendererExtended wingright3;
    private final AdvancedModelRendererExtended wingrightmembranemiddle;
    private final AdvancedModelRendererExtended wingright4;
    private final AdvancedModelRendererExtended wingrightmembraneend;
    private final AdvancedModelRendererExtended handL;
    private final AdvancedModelRendererExtended wingleft1;
    private final AdvancedModelRendererExtended wingleft2;
    private final AdvancedModelRendererExtended wingleftmembrane;
    private final AdvancedModelRendererExtended wingleft3;
    private final AdvancedModelRendererExtended wingleftmembranemiddle;
    private final AdvancedModelRendererExtended wingleft4;
    private final AdvancedModelRendererExtended wingleftmembraneend;
    private final AdvancedModelRendererExtended handR;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended wukong;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended wukong2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;

    private ModelAnimator animator;

    public ModelGermanodactylus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 12.5F, -5.7F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 33, -3.5F, -2.0F, -2.0F, 7, 7, 6, 0.0F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, 0.3F, 3.2F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 28, 25, -2.5F, -2.0F, 0.0F, 5, 6, 8, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -0.075F, 6.8F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.0456F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 49, 50, -1.5F, -1.4545F, 0.001F, 3, 4, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.4455F, 5.601F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0456F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 0, -1.0F, -1.0F, 0.0F, 2, 2, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.075F, 10.4F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0456F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 48, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0456F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 30, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.01F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0456F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 36, 39, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 26, 10, 0.0F, -1.5F, 2.0F, 0, 3, 11, 0.0F, false));

        this.upperlegL = new AdvancedModelRendererExtended(this);
        this.upperlegL.setRotationPoint(-2.0F, 0.55F, 5.4F);
        this.body1.addChild(upperlegL);
        this.setRotateAngle(upperlegL, -0.3206F, 0.0F, 0.5009F);
        this.upperlegL.cubeList.add(new ModelBox(upperlegL, 20, 33, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.lowerlegL = new AdvancedModelRendererExtended(this);
        this.lowerlegL.setRotationPoint(-0.1F, 3.7F, -0.3F);
        this.upperlegL.addChild(lowerlegL);
        this.setRotateAngle(lowerlegL, 0.7741F, 0.0F, -0.5463F);
        this.lowerlegL.cubeList.add(new ModelBox(lowerlegL, 36, 0, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.footL = new AdvancedModelRendererExtended(this);
        this.footL.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegL.addChild(footL);
        this.setRotateAngle(footL, -0.4098F, 0.5918F, -0.2276F);
        this.footL.cubeList.add(new ModelBox(footL, 22, 11, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

        this.legwing11 = new AdvancedModelRendererExtended(this);
        this.legwing11.setRotationPoint(-0.1F, 0.2F, 0.4F);
        this.lowerlegL.addChild(legwing11);
        this.setRotateAngle(legwing11, -0.0911F, 0.0F, 0.0F);
        this.legwing11.cubeList.add(new ModelBox(legwing11, 26, 0, 0.0F, 0.0F, 0.0F, 0, 6, 3, 0.001F, false));

        this.legwing12 = new AdvancedModelRendererExtended(this);
        this.legwing12.setRotationPoint(-0.3F, 0.0F, 0.9F);
        this.upperlegL.addChild(legwing12);
        this.legwing12.cubeList.add(new ModelBox(legwing12, 0, 20, -0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F, false));

        this.upperlegR = new AdvancedModelRendererExtended(this);
        this.upperlegR.setRotationPoint(2.0F, 0.55F, 5.4F);
        this.body1.addChild(upperlegR);
        this.setRotateAngle(upperlegR, -0.3206F, 0.0F, -0.5009F);
        this.upperlegR.cubeList.add(new ModelBox(upperlegR, 20, 33, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.lowerlegR = new AdvancedModelRendererExtended(this);
        this.lowerlegR.setRotationPoint(0.1F, 3.7F, -0.3F);
        this.upperlegR.addChild(lowerlegR);
        this.setRotateAngle(lowerlegR, 0.7741F, 0.0F, 0.5463F);
        this.lowerlegR.cubeList.add(new ModelBox(lowerlegR, 36, 0, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, true));

        this.footR = new AdvancedModelRendererExtended(this);
        this.footR.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegR.addChild(footR);
        this.setRotateAngle(footR, -0.4098F, -0.5918F, 0.2276F);
        this.footR.cubeList.add(new ModelBox(footR, 22, 11, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, true));

        this.legwing2 = new AdvancedModelRendererExtended(this);
        this.legwing2.setRotationPoint(0.1F, 0.2F, 0.4F);
        this.lowerlegR.addChild(legwing2);
        this.setRotateAngle(legwing2, -0.0911F, 0.0F, 0.0F);
        this.legwing2.cubeList.add(new ModelBox(legwing2, 26, 0, 0.0F, 0.0F, 0.0F, 0, 6, 3, 0.001F, true));

        this.legwing3 = new AdvancedModelRendererExtended(this);
        this.legwing3.setRotationPoint(0.3F, 0.0F, 0.9F);
        this.upperlegR.addChild(legwing3);
        this.legwing3.cubeList.add(new ModelBox(legwing3, 0, 20, -0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F, true));

        this.wingright1 = new AdvancedModelRendererExtended(this);
        this.wingright1.setRotationPoint(-2.1F, -0.2F, -1.6F);
        this.chest.addChild(wingright1);
        this.setRotateAngle(wingright1, 0.0429F, 0.0359F, 0.1006F);
        this.wingright1.cubeList.add(new ModelBox(wingright1, 0, 21, -6.0F, -1.0F, -1.0F, 8, 2, 10, 0.0F, false));

        this.wingright2 = new AdvancedModelRendererExtended(this);
        this.wingright2.setRotationPoint(-5.2F, 0.1F, -0.7F);
        this.wingright1.addChild(wingright2);
        this.wingright2.cubeList.add(new ModelBox(wingright2, 18, 0, -0.5F, 0.0F, 0.0F, 1, 12, 3, 0.0F, false));

        this.wingrightmembrane = new AdvancedModelRendererExtended(this);
        this.wingrightmembrane.setRotationPoint(9.3F, 11.6F, 7.0F);
        this.wingright2.addChild(wingrightmembrane);
        this.wingrightmembrane.cubeList.add(new ModelBox(wingrightmembrane, 37, 50, -9.8F, -11.6F, -4.0F, 1, 12, 5, 0.0F, false));

        this.wingright3 = new AdvancedModelRendererExtended(this);
        this.wingright3.setRotationPoint(-0.1F, 12.05F, 0.3F);
        this.wingright2.addChild(wingright3);
        this.setRotateAngle(wingright3, 0.0F, 0.0F, 0.0F);
        this.wingright3.cubeList.add(new ModelBox(wingright3, 17, 45, -0.5F, -3.0F, 0.0F, 1, 3, 9, 0.0F, false));

        this.wingrightmembranemiddle = new AdvancedModelRendererExtended(this);
        this.wingrightmembranemiddle.setRotationPoint(9.4F, -0.4F, 6.7F);
        this.wingright3.addChild(wingrightmembranemiddle);
        this.wingrightmembranemiddle.cubeList.add(new ModelBox(wingrightmembranemiddle, 46, 15, -9.9F, -5.575F, -6.7F, 1, 3, 9, -0.01F, false));

        this.wingright4 = new AdvancedModelRendererExtended(this);
        this.wingright4.setRotationPoint(0.1F, 0.0F, 8.7F);
        this.wingright3.addChild(wingright4);
        this.setRotateAngle(wingright4, 0.9599F, 0.0F, 0.0F);
        this.wingright4.cubeList.add(new ModelBox(wingright4, 18, 3, -0.5F, -2.0F, 0.0F, 1, 2, 16, 0.0F, false));

        this.wingrightmembraneend = new AdvancedModelRendererExtended(this);
        this.wingrightmembraneend.setRotationPoint(9.3F, -0.4F, -4.0F);
        this.wingright4.addChild(wingrightmembraneend);
        this.wingrightmembraneend.cubeList.add(new ModelBox(wingrightmembraneend, 0, 0, -9.8F, -4.575F, 4.0F, 1, 3, 16, -0.01F, false));

        this.handL = new AdvancedModelRendererExtended(this);
        this.handL.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.wingright3.addChild(handL);
        this.handL.cubeList.add(new ModelBox(handL, 0, 27, -1.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, false));

        this.wingleft1 = new AdvancedModelRendererExtended(this);
        this.wingleft1.setRotationPoint(2.1F, -0.2F, -1.6F);
        this.chest.addChild(wingleft1);
        this.setRotateAngle(wingleft1, 0.0429F, 0.0359F, -0.0911F);
        this.wingleft1.cubeList.add(new ModelBox(wingleft1, 0, 21, -2.0F, -1.0F, -1.0F, 8, 2, 10, 0.0F, true));

        this.wingleft2 = new AdvancedModelRendererExtended(this);
        this.wingleft2.setRotationPoint(5.2F, 0.1F, -0.7F);
        this.wingleft1.addChild(wingleft2);
        this.wingleft2.cubeList.add(new ModelBox(wingleft2, 18, 0, -0.5F, 0.0F, 0.0F, 1, 12, 3, 0.0F, true));

        this.wingleftmembrane = new AdvancedModelRendererExtended(this);
        this.wingleftmembrane.setRotationPoint(-9.3F, 11.6F, 7.0F);
        this.wingleft2.addChild(wingleftmembrane);
        this.wingleftmembrane.cubeList.add(new ModelBox(wingleftmembrane, 37, 50, 8.8F, -11.6F, -4.0F, 1, 12, 5, 0.0F, true));

        this.wingleft3 = new AdvancedModelRendererExtended(this);
        this.wingleft3.setRotationPoint(0.1F, 12.05F, 0.3F);
        this.wingleft2.addChild(wingleft3);
        this.setRotateAngle(wingleft3, 0.0F, 0.0F, 0.0F);
        this.wingleft3.cubeList.add(new ModelBox(wingleft3, 17, 45, -0.5F, -3.0F, 0.0F, 1, 3, 9, 0.0F, true));

        this.wingleftmembranemiddle = new AdvancedModelRendererExtended(this);
        this.wingleftmembranemiddle.setRotationPoint(-9.4F, -0.4F, 6.7F);
        this.wingleft3.addChild(wingleftmembranemiddle);
        this.wingleftmembranemiddle.cubeList.add(new ModelBox(wingleftmembranemiddle, 46, 15, 8.9F, -5.575F, -6.7F, 1, 3, 9, -0.01F, true));

        this.wingleft4 = new AdvancedModelRendererExtended(this);
        this.wingleft4.setRotationPoint(-0.1F, 0.0F, 8.7F);
        this.wingleft3.addChild(wingleft4);
        this.setRotateAngle(wingleft4, 0.9599F, 0.0F, 0.0F);
        this.wingleft4.cubeList.add(new ModelBox(wingleft4, 18, 3, -0.5F, -2.0F, 0.0F, 1, 2, 16, 0.0F, true));

        this.wingleftmembraneend = new AdvancedModelRendererExtended(this);
        this.wingleftmembraneend.setRotationPoint(-9.3F, -0.4F, -4.0F);
        this.wingleft4.addChild(wingleftmembraneend);
        this.wingleftmembraneend.cubeList.add(new ModelBox(wingleftmembraneend, 0, 0, 8.8F, -4.575F, 4.0F, 1, 3, 16, -0.01F, true));

        this.handR = new AdvancedModelRendererExtended(this);
        this.handR.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.wingleft3.addChild(handR);
        this.handR.cubeList.add(new ModelBox(handR, 0, 27, -0.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -1.3F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 0, -2.0F, -2.0F, -4.0F, 4, 6, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 59, 27, -1.5F, -1.0F, -4.0F, 3, 5, 4, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 49, 60, -2.0F, -1.0F, -3.0F, 4, 3, 4, 0.0F, false));

        this.wukong = new AdvancedModelRendererExtended(this);
        this.wukong.setRotationPoint(-1.25F, 0.05F, -3.7F);
        this.head.addChild(wukong);
        this.setRotateAngle(wukong, 0.6545F, 0.0F, 0.0F);
        this.wukong.cubeList.add(new ModelBox(wukong, 0, 7, 0.0F, -1.25F, 0.0F, 0, 2, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-0.0436F, 1.6912F, 12.3184F);
        this.wukong.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.8287F, 0.0167F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 5, 0.0305F, -0.301F, 0.037F, 0, 1, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -1.25F, 6.0F);
        this.wukong.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3924F, 0.0167F, 0.0403F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 3, 0.0F, 0.0F, 0.0F, 0, 2, 7, 0.0F, false));

        this.wukong2 = new AdvancedModelRendererExtended(this);
        this.wukong2.setRotationPoint(1.25F, 0.05F, -3.7F);
        this.head.addChild(wukong2);
        this.setRotateAngle(wukong2, 0.6545F, 0.0F, 0.0F);
        this.wukong2.cubeList.add(new ModelBox(wukong2, 0, 7, 0.0F, -1.25F, 0.0F, 0, 2, 6, 0.0F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0436F, 1.6912F, 12.3184F);
        this.wukong2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.8287F, -0.0167F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 5, -0.0305F, -0.301F, 0.037F, 0, 1, 7, 0.0F, true));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -1.25F, 6.0F);
        this.wukong2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3924F, -0.0167F, -0.0403F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, 0.0F, 0.0F, 0.0F, 0, 2, 7, 0.0F, true));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 48, 40, -1.5F, -2.0F, -5.0F, 3, 2, 7, 0.002F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -4.5F, -2.0F);
        this.head2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 29, 0.0F, -3.05F, -4.0F, 0, 6, 10, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.head2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 24, -1.0F, -0.125F, 4.1F, 2, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.head2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 57, 16, -1.5F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1309F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 13, 57, -1.0F, -2.0F, -7.0F, 2, 1, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.head3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 14, 0.0F, -0.525F, -7.0F, 0, 1, 5, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.head3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 14, 0.0F, -0.525F, -7.0F, 0, 1, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-0.001F, -2.0008F, -7.0012F);
        this.head3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.144F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 0, -0.999F, 0.0F, 0.0F, 2, 1, 7, -0.001F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 45, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3272F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 46, -1.5F, -3.0F, 0.0F, 3, 3, 3, 0.001F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.1309F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 36, 13, -1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 9, 19, -1.5F, 0.0F, -2.5F, 3, 1, 1, -0.001F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(1.0F, -0.3135F, -7.2828F);
        this.jaw2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1231F, 0.0447F, 0.3463F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 10, 0.0F, -0.2957F, -4.5653F, 0, 1, 5, 0.0F, true));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-1.0F, -0.3135F, -7.2828F);
        this.jaw2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1231F, -0.0447F, -0.3463F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 10, 0.0F, -0.2957F, -4.5653F, 0, 1, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.jaw2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 57, 8, -1.0F, -1.0F, -7.0F, 2, 1, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(chest, -1.5F, 3.1F, 0.0F);
        this.setRotateAngle(body1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.1F, -0.05F, -0.2F);
        this.setRotateAngle(neck2, -0.2F, -0.1F, -0.2F);
        this.setRotateAngle(head, 0.5F, 0.0F, -0.3F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(upperlegR, 0.0F, 0.0F, -1.0F);
        this.setRotateAngle(lowerlegR, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(footR, -0.2F, 0.5F, 0.8F);
        this.setRotateAngle(upperlegL, 0.0F, 0.0F, 1.0F);
        this.setRotateAngle(lowerlegL, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(footL, 0.2F, -0.5F, -0.8F);
        this.setRotateAngle(wingleft1, 0.0F, 0.0F, -0.05F);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -0.9F);
        this.setRotateAngle(wingleft3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft4, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(handR, 0.0F, 0.0F, 1.0F);
        this.setRotateAngle(wingright1, 0.0F, 0.0F, 0.05F);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 0.9F);
        this.setRotateAngle(wingright3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wingright4, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(handL, 0.0F, 0.0F, 1.0F);
        this.root.offsetY = -0.15F;
        this.root.offsetX = 0.0F;
        this.root.offsetZ = 0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(chest, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegR, 0.3F, -0.3F, -0.5F);
        this.setRotateAngle(lowerlegR, 1.2F, 0.2F, 0.2F);
        this.setRotateAngle(footR, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegL, -0.3F, 0.0F, 0.5F);
        this.setRotateAngle(lowerlegL, 0.2F, 0.0F, -0.5F);
        this.setRotateAngle(footL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft1, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(wingleft3, -1.5F, 0.0F, 0.2F);
        this.setRotateAngle(wingleft4, 0.0F, -0.6F, 0.0F);
        this.setRotateAngle(handR, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(wingright1, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(wingright3, -1.5F, 0.0F, -0.2F);
        this.setRotateAngle(wingright4, 0.0F, 0.6F, 0.0F);
        this.setRotateAngle(handL, 0.0F, 0.0F, -1.5F);
        this.root.offsetY = 0.2F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        this.setRotateAngle(chest, 0.0F, -0.1F, 0.05F);
        this.setRotateAngle(body1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(neck, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.02F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.02F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.04F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.04F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.04F, 0.0F);
        this.setRotateAngle(upperlegR, 0.4F, 0.0F, -1.3F);
        this.setRotateAngle(lowerlegR, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(footR, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegL, 0.4F, 0.0F, 1.3F);
        this.setRotateAngle(lowerlegL, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(footL, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft1, 0.0F, 0.0F, -0.05F);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -1.45F);
        this.setRotateAngle(wingleft3, -1.5F, 0.0F, 0.09F);
        this.setRotateAngle(wingleft4, 0.0F, 0.07F, -0.05F);
        this.setRotateAngle(wingright1, 0.0F, 0.0F, 0.05F);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 1.45F);
        this.setRotateAngle(wingright3, -1.5F, 0.0F, -0.09F);
        this.setRotateAngle(wingright4, 0.0F, -0.05F, 0.0F);
        this.root.offsetY = -0.12F;
        this.root.offsetZ = 0.02F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.5F;
        this.root.offsetX = -0.37F;
        this.root.rotateAngleY = (float)Math.toRadians(130);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 1.58F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(chest, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegR, 0.3F, -0.3F, -0.5F);
        this.setRotateAngle(lowerlegR, 1.2F, 0.2F, 0.2F);
        this.setRotateAngle(footR, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegL, -0.3F, 0.0F, 0.5F);
        this.setRotateAngle(lowerlegL, 0.2F, 0.0F, -0.5F);
        this.setRotateAngle(footL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wingleft1, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(wingleft2, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(wingleft3, -1.5F, 0.0F, 0.2F);
        this.setRotateAngle(wingleft4, 0.0F, -0.6F, 0.0F);
        this.setRotateAngle(handR, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(wingright1, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(wingright2, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(wingright3, -1.5F, 0.0F, -0.2F);
        this.setRotateAngle(wingright4, 0.0F, 0.6F, 0.0F);
        this.setRotateAngle(handL, 0.0F, 0.0F, -1.5F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) e;

        AdvancedModelRenderer[] tailFull = {this.tail1};

        float speed = 0.76F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
            this.faceTarget(f3, f4, 8, neck);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 4, head);

            //if (ee.getIsMoving()) {
            AdvancedModelRenderer[] wingLeft = {this.wingleft1, this.wingleft2, this.wingleft3, this.wingleft4};
            AdvancedModelRenderer[] wingRight = {this.wingright1, this.wingright2, this.wingright3, this.wingright4};

            AdvancedModelRenderer[] legLeft = {this.upperlegL, this.lowerlegL, this.footL};
            AdvancedModelRenderer[] legRight = {this.upperlegR, this.lowerlegR, this.footR};

            AdvancedModelRenderer[] tailFullFly = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
            float speedFly = 1.50F;
            float fixedY = 0; //The standard offset to centre the mob
            if (flier.getIsFast()) { //Flying fast
                speedFly = 2.24F;
            }
            else { //Flying regular

            }

            //Animations:
            this.chainFlap(wingLeft, speedFly, 0.35F, 0.3F, f2, 1F);
            this.chainFlap(wingRight, speedFly, -0.35F, -0.3F, f2, 1F);

            this.swing(wingleft3, speedFly, 0.7F, false, 2.0F, 0.12F, f2, 1F);
            this.swing(wingright3, speedFly, -0.7F, false, 2.0F, -0.12F, f2, 1F);

            this.swing(wingleft1, speedFly, 0.10F, false, 2.0F, 0.08F, f2, 1F);
            this.swing(wingright1, speedFly, -0.10F, false, 2.0F, -0.08F, f2, 1F);

            float floatMoveZ = this.moveBoxExtended(speedFly * 0.3F, 0.30F, false, 4, f2, 1);
            this.root.offsetZ = floatMoveZ;
            float floatMoveY = this.moveBoxExtended(speedFly * 0.6F, 0.50F, false, 4, f2, 1);
            this.root.offsetY = (floatMoveY) + fixedY;

            this.chainWaveExtended(legLeft, speedFly, 0.055F, 0.1F, 0F, f2, 1F);
            this.chainWaveExtended(legRight, speedFly, -0.055F, -0.1F, 3F, f2, 1F);
            this.chainWave(tailFullFly, speedFly * 0.5F, 0.02F, 0.5F, f2, 1F);
            this.chainSwing(tailFullFly, speedFly * 0.5F, 0.15F, 2.0F, f2, 1F);

        }
        else { //not flying
            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }
            this.faceTarget(f3, f4, 12, neck);
            this.faceTarget(f3, f4, 12, neck2);
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGermanodactylus ee = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
            this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail1, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, 0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, 0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail4, 0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(tail5, 0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegL, -0.1286F, -0.0332F, -1.4914F);
            this.setRotateAngle(lowerlegL, 0.8647F, 0.1147F, 0.2812F);
            this.setRotateAngle(footL, 1.0606F, -0.5918F, 0.2276F);
            this.setRotateAngle(legwing11, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegR, -0.1286F, 0.0332F, 1.4914F);
            this.setRotateAngle(lowerlegR, 0.8647F, -0.1147F, -0.2812F);
            this.setRotateAngle(footR, 1.0606F, 0.5918F, -0.2276F);
            this.setRotateAngle(legwing2, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(wingleft1, 0.0429F, 0.0206F, -0.0911F);
            this.setRotateAngle(wingleft2, 0.0F, 0.0F, -1.5509F);
            this.setRotateAngle(wingleft3, -1.4748F, 0.0F, 0.0F);
            this.setRotateAngle(wingleft4, 0.1375F, 0.0F, 0.0F);
            this.setRotateAngle(handL, 0.0F, 0.0F, 1.5533F);
            this.setRotateAngle(wingright1, 0.0429F, -0.0206F, 0.0911F);
            this.setRotateAngle(wingright2, 0.0F, 0.0F, 1.5509F);
            this.setRotateAngle(wingright3, -1.4748F, 0.0F, 0.0F);
            this.setRotateAngle(wingright4, 0.1375F, 0.0F, 0.0F);
            this.setRotateAngle(handR, 0.0F, 0.0F, -1.5621F);
            this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);
            this.setRotateAngle(wukong, 0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.8287F, 0.0167F, 0.0F);
            this.setRotateAngle(cube_r2, -0.3924F, 0.0167F, 0.0403F);
            this.setRotateAngle(wukong2, 0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.8287F, -0.0167F, 0.0F);
            this.setRotateAngle(cube_r4, -0.3924F, -0.0167F, -0.0403F);
            this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.1571F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(head3, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
            this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
            this.setRotateAngle(cube_r10, 0.144F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, -0.3272F, 0.0F, 0.0F);
            this.setRotateAngle(jaw2, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, -0.1231F, 0.0447F, 0.3463F);
            this.setRotateAngle(cube_r13, -0.1231F, -0.0447F, -0.3463F);
            this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);

            if (ee.getAttachmentPos() == null ) {
                //if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Flying fast
                    //animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else { //Flying regular
                    //animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                //}
            }

        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
            }
            else {
                //Climb pose
                this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
                this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(tail1, -0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(tail2, 0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(tail3, 0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(tail4, 0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(tail5, 0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(upperlegL, -0.0045F, 0.1874F, 1.1089F);
                this.setRotateAngle(lowerlegL, 0.7126F, 0.1021F, 0.1306F);
                this.setRotateAngle(footL, 0.1012F, -0.4664F, -1.1122F);
                this.setRotateAngle(legwing11, -0.0911F, 0.0F, 0.0F);
                this.setRotateAngle(upperlegR, 0.0045F, -0.1874F, -1.1089F);
                this.setRotateAngle(lowerlegR, 0.7126F, 0.1021F, 0.1306F);
                this.setRotateAngle(footR, -0.3607F, -0.3571F, 0.1209F);
                this.setRotateAngle(cube_r1, 0.3004F, 0.2841F, 0.968F);
                this.setRotateAngle(legwing2, -0.0911F, 0.0F, 0.0F);
                this.setRotateAngle(wingright1, 0.0528F, -0.0186F, 0.2576F);
                this.setRotateAngle(wingright2, 0.0F, 0.0F, 0.4887F);
                this.setRotateAngle(wingright3, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(wingright4, 0.528F, 0.0F, 0.0F);
                this.setRotateAngle(handL, 0.0F, 0.0F, -0.8072F);
                this.setRotateAngle(wingleft1, 0.0482F, -0.0286F, -0.2619F);
                this.setRotateAngle(wingleft2, 0.0F, 0.0F, -0.4887F);
                this.setRotateAngle(wingleft3, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(wingleft4, 0.528F, 0.0F, 0.0F);
                this.setRotateAngle(handR, 0.0F, 0.0F, 0.6981F);
                this.setRotateAngle(neck, 0.0785F, 0.0F, 0.0F);
                this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
                this.setRotateAngle(head, 0.3142F, 0.0F, 0.0F);
                this.setRotateAngle(wukong, 0.6545F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r2, -0.8287F, 0.0167F, 0.0F);
                this.setRotateAngle(cube_r3, -0.3924F, 0.0167F, 0.0403F);
                this.setRotateAngle(wukong2, 0.6545F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r4, -0.8287F, -0.0167F, 0.0F);
                this.setRotateAngle(cube_r5, -0.3924F, -0.0167F, -0.0403F);
                this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r7, 0.1571F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
                this.setRotateAngle(head3, -0.1309F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.4363F);
                this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.4363F);
                this.setRotateAngle(cube_r11, 0.144F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r12, -0.3272F, 0.0F, 0.0F);
                this.setRotateAngle(jaw2, 0.1309F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r13, -0.1231F, 0.0447F, 0.3463F);
                this.setRotateAngle(cube_r14, -0.1231F, -0.0447F, -0.3463F);
            }
        }

        if (ee.getAttachmentPos() == null ) {
            //if (ee.getIsMoving()) {
//                if (ee.getIsFast()) { //Flying fast
//                    animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
//                }
//                else { //Flying regular
//                    animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
//                }
            //}
        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Walking fast
                        animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else { //Walking regular
                        animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }

            }
            else if (!ee.getHeadCollided()){
                //Climbing
                animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.PREEN_ANIMATION) {
            animPreen(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;

    }

    public void animPreen(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;

       
    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;
        
        
    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;
        
    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;
        

    }

    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;
       

    }

    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;

      
    }

    public void animFlyFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, ((-0.0456F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest, ((-0.0892F)-(-0.0892F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.8287F)-(-0.8287F)), ((0.0167F)-(0.0167F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.144F)-(0.144F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((-0.3272F)-(-0.3272F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((-0.1231F)-(-0.1231F)), ((0.0447F)-(0.0447F)),((0.3463F)-(0.3463F)));
        animator.rotate(cube_r13, ((-0.1231F)-(-0.1231F)), ((-0.0447F)-(-0.0447F)),((-0.3463F)-(-0.3463F)));
        animator.rotate(cube_r14, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.3924F)-(-0.3924F)), ((0.0167F)-(0.0167F)),((0.0403F)-(0.0403F)));
        animator.rotate(cube_r3, ((-0.8287F)-(-0.8287F)), ((-0.0167F)-(-0.0167F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((-0.3924F)-(-0.3924F)), ((-0.0167F)-(-0.0167F)),((-0.0403F)-(-0.0403F)));
        animator.rotate(cube_r5, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.1571F)-(0.1571F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.4363F)-(-0.4363F)));
        animator.rotate(cube_r9, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.4363F)-(0.4363F)));
        animator.rotate(footL, ((1.0606F)-(-0.4098F)), ((-0.5918F)-(0.5918F)),((0.2276F)-(-0.2276F)));
        animator.rotate(footR, ((1.0606F)-(-0.4098F)), ((0.5918F)-(-0.5918F)),((-0.2276F)-(0.2276F)));
        animator.rotate(handL, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((1.5533F)-(0.0F)));
        animator.rotate(handR, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-1.5621F)-(0.0F)));
        animator.rotate(head, ((0.48F)-(0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head2, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head3, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw2, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legwing11, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legwing2, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lowerlegL, ((0.8647F)-(0.7741F)), ((0.1147F)-(0.0F)),((0.2812F)-(-0.5463F)));
        animator.rotate(lowerlegR, ((0.8647F)-(0.7741F)), ((-0.1147F)-(0.0F)),((-0.2812F)-(0.5463F)));
        animator.rotate(neck, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail1, ((-0.0456F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail2, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail3, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail4, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail5, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(upperlegL, ((-0.1286F)-(-0.3206F)), ((-0.0332F)-(0.0F)),((-1.4914F)-(0.5009F)));
        animator.rotate(upperlegR, ((-0.1286F)-(-0.3206F)), ((0.0332F)-(0.0F)),((1.4914F)-(-0.5009F)));
        animator.rotate(wingleft1, ((0.0429F)-(0.0429F)), ((0.0206F)-(0.0359F)),((-0.0911F)-(-0.0911F)));
        animator.rotate(wingleft2, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-1.5509F)-(0.0F)));
        animator.rotate(wingleft3, ((-1.4748F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wingleft4, ((0.1375F)-(0.9599F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wingright1, ((0.0429F)-(0.0429F)), ((-0.0206F)-(0.0359F)),((0.0911F)-(0.1006F)));
        animator.rotate(wingright2, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((1.5509F)-(0.0F)));
        animator.rotate(wingright3, ((-1.4748F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wingright4, ((0.1375F)-(0.9599F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wukong, ((0.6545F)-(0.6545F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wukong2, ((0.6545F)-(0.6545F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, -((-0.0456F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest, -((-0.0892F)-(-0.0892F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.8287F)-(-0.8287F)), -((0.0167F)-(0.0167F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.144F)-(0.144F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((-0.3272F)-(-0.3272F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((-0.1231F)-(-0.1231F)), -((0.0447F)-(0.0447F)),-((0.3463F)-(0.3463F)));
        animator.rotate(cube_r13, -((-0.1231F)-(-0.1231F)), -((-0.0447F)-(-0.0447F)),-((-0.3463F)-(-0.3463F)));
        animator.rotate(cube_r14, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.3924F)-(-0.3924F)), -((0.0167F)-(0.0167F)),-((0.0403F)-(0.0403F)));
        animator.rotate(cube_r3, -((-0.8287F)-(-0.8287F)), -((-0.0167F)-(-0.0167F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((-0.3924F)-(-0.3924F)), -((-0.0167F)-(-0.0167F)),-((-0.0403F)-(-0.0403F)));
        animator.rotate(cube_r5, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.1571F)-(0.1571F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.4363F)-(-0.4363F)));
        animator.rotate(cube_r9, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.4363F)-(0.4363F)));
        animator.rotate(footL, -((1.0606F)-(-0.4098F)), -((-0.5918F)-(0.5918F)),-((0.2276F)-(-0.2276F)));
        animator.rotate(footR, -((1.0606F)-(-0.4098F)), -((0.5918F)-(-0.5918F)),-((-0.2276F)-(0.2276F)));
        animator.rotate(handL, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((1.5533F)-(0.0F)));
        animator.rotate(handR, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-1.5621F)-(0.0F)));
        animator.rotate(head, -((0.48F)-(0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head2, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head3, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw2, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legwing11, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legwing2, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lowerlegL, -((0.8647F)-(0.7741F)), -((0.1147F)-(0.0F)),-((0.2812F)-(-0.5463F)));
        animator.rotate(lowerlegR, -((0.8647F)-(0.7741F)), -((-0.1147F)-(0.0F)),-((-0.2812F)-(0.5463F)));
        animator.rotate(neck, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail1, -((-0.0456F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail2, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail3, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail4, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail5, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(upperlegL, -((-0.1286F)-(-0.3206F)), -((-0.0332F)-(0.0F)),-((-1.4914F)-(0.5009F)));
        animator.rotate(upperlegR, -((-0.1286F)-(-0.3206F)), -((0.0332F)-(0.0F)),-((1.4914F)-(-0.5009F)));
        animator.rotate(wingleft1, -((0.0429F)-(0.0429F)), -((0.0206F)-(0.0359F)),-((-0.0911F)-(-0.0911F)));
        animator.rotate(wingleft2, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-1.5509F)-(0.0F)));
        animator.rotate(wingleft3, -((-1.4748F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wingleft4, -((0.1375F)-(0.9599F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wingright1, -((0.0429F)-(0.0429F)), -((-0.0206F)-(0.0359F)),-((0.0911F)-(0.1006F)));
        animator.rotate(wingright2, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((1.5509F)-(0.0F)));
        animator.rotate(wingright3, -((-1.4748F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wingright4, -((0.1375F)-(0.9599F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wukong, -((0.6545F)-(0.6545F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wukong2, -((0.6545F)-(0.6545F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
